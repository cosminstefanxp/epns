package se2.e.engine3d.j3d;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Group;
import javax.media.j3d.Node;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.View;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import se2.e.engine3d.Engine3D;
import se2.e.engine3d.Engine3DListener;
import se2.e.engine3d.GeometryAndAppearanceLoader;
import se2.e.engine3d.j3d.animations.RuntimeAnimation;
import se2.e.engine3d.j3d.animations.RuntimeAnimationFactory;
import se2.e.engine3d.j3d.animations.RuntimeAnimationListener;
import se2.e.geometry.Geometry;
import se2.e.geometry.SimplePosition;
import se2.e.simulator.runtime.petrinet.RuntimeToken;
import animations.Animation;
import appearance.AppearanceModel;

import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.universe.Viewer;
import com.sun.j3d.utils.universe.ViewingPlatform;

/**
 * The Class J3DEngine that is an implementation of an {@link Engine3D} using Java 3D library.
 * 
 * @author cosmin
 */
public class J3DEngine extends JFrame implements Engine3D, ActionListener, RuntimeAnimationListener {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5165791727088692312L;

	/** The universe. */
	private SimpleUniverse universe;

	/** The start button. */
	private JButton btnStart;

	/** The stop button. */
	private JButton btnStop;

	/** The pause button. */
	private JButton btnPause;

	/** The animation progress listener. */
	private Engine3DListener engineListener = null;

	/** The scene branch group. */
	private BranchGroup sceneRoot;

	/** The geometry. */
	private GeometryAndAppearanceLoader loader;

	/** The dynamic branch factory. */
	private DynamicBranchFactory dynamicBranchFactory;

	/** The geometry node factory. */
	private GeometryNodeFactory geometryNodeFactory;

	/** The logger. */
	private Logger log = Logger.getLogger("J3DEngine");

	/** The running animations. */
	private List<RuntimeAnimation<?>> runningAnimations;

	/** The canvas. */
	private Canvas3D canvas;

	/**
	 * Instantiates a new Java 3D engine.
	 * 
	 * @throws HeadlessException the headless exception
	 * @author cosmin
	 */
	public J3DEngine() throws HeadlessException {
		// Setup a SimpleUniverse by referencing a Canvas3D
		GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
		canvas = new Canvas3D(config);
		Container cp = this.getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(canvas, BorderLayout.CENTER);

		// Initialize the buttons
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);

		btnStart = new JButton("Start");
		btnStart.addActionListener(this);
		panel.add(btnStart);

		btnStop = new JButton("Stop");
		btnStop.addActionListener(this);
		btnStop.setEnabled(false);
		panel.add(btnStop);

		btnPause = new JButton("Pause");
		btnPause.addActionListener(this);
		btnPause.setEnabled(false);
		panel.add(btnPause);

		// Configure this JFrame
		this.setLocation(200, 200);
		this.setSize(640, 480);
		this.setTitle("Hello Universe");
		// this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// Show the JFrame
		this.setVisible(true);

	}

	/**
	 * Creates the universe and set up the viewer.
	 * 
	 * @param canvas the canvas
	 * @return the simple universe
	 * @author cosmin
	 */
	private SimpleUniverse createUniverse(Canvas3D canvas) {
		// Manually create the viewing platform so that we can customize it
		ViewingPlatform viewingPlatform = new ViewingPlatform();

		// Set the view position back far enough so that we can see things
		TransformGroup viewTransform = viewingPlatform.getViewPlatformTransform();
		Transform3D t3d = new Transform3D();
		// Compute initial values for viewer
		double xCenter = (loader.maxX + loader.minX) / 2;
		double yCenter = (loader.maxY + loader.minY) / 2;
		double zHeight = ((loader.maxX - loader.minX) + (loader.maxY - loader.minY));
		// double zHeight=1500;
		t3d.lookAt(new Point3d(xCenter, yCenter, zHeight), new Point3d(xCenter, yCenter, 0), new Vector3d(0, 1, 0));
		t3d.invert();
		viewTransform.setTransform(t3d);

		// Set the activation radius
		viewingPlatform.getViewPlatform().setActivationRadius((float) (2 * zHeight));

		// Set back clip distance so things don't disappear
		Viewer viewer = new Viewer(canvas);
		View view = viewer.getView();
		view.setBackClipDistance(2 * zHeight);

		return new SimpleUniverse(viewingPlatform, viewer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.Engine3D#init(java.lang.Object, java.lang.Object)
	 * 
	 * @author cosmin, marius (some fixes after update of loader and dynamicBranchFactory class)
	 */
	@Override
	public void init(Geometry geometry, AppearanceModel appearance) {

		// Load the geometry and appearance
		this.loader = new GeometryAndAppearanceLoader(geometry, appearance);
		this.geometryNodeFactory = new GeometryNodeFactory(loader, this, canvas);

		// Load the universe
		universe = createUniverse(canvas);

		// Create the initial scene and add it to the graph
		sceneRoot = createSceneGraph();
		universe.addBranchGraph(sceneRoot);

		// Initialize other objects
		runningAnimations = new ArrayList<RuntimeAnimation<?>>();
		this.dynamicBranchFactory = new DynamicBranchFactory(loader, this);

		log.info("J3D Engine initialized...");
	}

	/**
	 * Creates the scene graph (content branch) and add the static objects (e.g. {@link Place}s representations).
	 * 
	 * @return the branch group
	 * @author cosmin
	 */
	public BranchGroup createSceneGraph() {
		// Create the root node of the content branch
		BranchGroup rootNode = new BranchGroup();

		// Add representations for the tracks
		Group trackGroup = new Group();
		for (String label : loader.getTrackLabels()) {

			// Create the node corresponding to tracks and add it to the scene graph
			Node geometryNode = geometryNodeFactory.getGeometryNode(label);
			if (geometryNode != null)
				trackGroup.addChild(geometryNode);
		}
		rootNode.addChild(trackGroup);

		// Add representations for the tracks
		Group inputPlacesGroup = new Group();
		for (String label : loader.getSimplePositionLabels()) {
			SimplePosition obj = loader.getSimplePositionObject(label);
			// Create the node corresponding to input places and add it to the scene graph
			InteractiveInputBranch inputPlaceBranch = geometryNodeFactory.getInteractiveInputBranch(
					obj.getAppearanceLabel(), label);
			if (inputPlaceBranch != null)
				inputPlacesGroup.addChild(inputPlaceBranch.getBranchGroup());
		}
		rootNode.addChild(inputPlacesGroup);

		// Compile to perform optimizations on this content branch.
		rootNode.setCapability(BranchGroup.ALLOW_CHILDREN_EXTEND);
		rootNode.setCapability(BranchGroup.ALLOW_CHILDREN_WRITE);
		rootNode.compile();

		return rootNode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		// If the user clicked the Start Button
		if (e.getSource() == btnStart) {
			log.info("Starting engine 3D...");
			if (this.engineListener != null) {
				engineListener.onStartSimulation();
				btnStart.setEnabled(false);
			}
		}

		// TODO: Add implementation for Pause and Stop
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.Engine3D#startAnimation(petrinet.Token, petrinet.Place)
	 * 
	 * @author cosmin
	 */
	@Override
	public void startAnimation(RuntimeToken token, Animation animation) {
		// Build the branch representing the token
		// TODO: Fix for dynamic objects (e.g. when using ShowAnimation)
		DynamicBranch branch = dynamicBranchFactory.getTokenBranch(token.getLabel());

		// Build the RuntimeAnimation
		RuntimeAnimation<?> rtAnimation = RuntimeAnimationFactory.getRuntimeAnimation(branch, animation, token, this);
		runningAnimations.add(rtAnimation);

		// Attach the Animation branch to the Scene graph
		sceneRoot.addChild(branch.getBranchGroup());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.Engine3D#setAnimationProgressListener(se2.e.engine3d.AnimationProgressListener)
	 * 
	 * @author cosmin
	 */
	@Override
	public void setEngine3DListener(Engine3DListener listener) {
		this.engineListener = listener;
	}

	/**
	 * Gets the scene root.
	 * 
	 * @return the scene root
	 */
	public BranchGroup getSceneRoot() {
		return sceneRoot;
	}

	/**
	 * Gets the geometry and appearance loader.
	 * 
	 * @return the geometry and appearance loader
	 */
	public GeometryAndAppearanceLoader getGeometryAndAppearanceLoader() {
		return loader;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimationListener#animationFinished(se2.e.simulator.runtime.petrinet.
	 * RuntimeToken)
	 */
	public void animationFinished(RuntimeToken token) {
		// Notify the engine listener
		engineListener.onAnimationFinished(token);
	}

	/**
	 * Method called when an user has interacted with an Interactive Input place.
	 * 
	 * @param geometryLabel the geometry label of the interactive input place
	 */
	public void userInteraction(String geomLabel) {
		// Notify the engine listener
		engineListener.onUserInteraction(geomLabel);
	}
}
