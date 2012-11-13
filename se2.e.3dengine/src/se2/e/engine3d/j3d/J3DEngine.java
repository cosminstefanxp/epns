package se2.e.engine3d.j3d;

import geometry.Geometry;
import geometry.GeometryObject;
import geometry.Track;
import geometry.TrackPosition;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

import javax.media.j3d.Alpha;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Group;
import javax.media.j3d.LineArray;
import javax.media.j3d.PositionPathInterpolator;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;

import petrinet.Place;
import se2.e.engine3d.Engine3D;
import se2.e.engine3d.Engine3DListener;
import se2.e.engine3d.GeometryAndAppearanceLoader;
import se2.e.simulator.runtime.petrinet.RuntimeToken;

import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;

/**
 * The Class J3DEngine that is an implementation of an {@link Engine3D} using Java 3D library.
 * 
 * @author cosmin
 */
public class J3DEngine extends JFrame implements Engine3D, ActionListener {

	/** The Constant DRAWING_PLANE_Z. */
	private static final double DRAWING_PLANE_Z = 0d;

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

	/** The logger. */
	private Logger log = Logger.getLogger("J3DEngine");

	/** The running animations. */
	private HashMap<RuntimeToken, RunningAnimation> runningAnimations;

	/**
	 * Instantiates a new Java 3D engine.
	 * 
	 * @throws HeadlessException the headless exception
	 * @author cosmin
	 */
	public J3DEngine() throws HeadlessException {
		// Setup a SimpleUniverse by referencing a Canvas3D
		GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
		Canvas3D canvas = new Canvas3D(config);
		Container cp = this.getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(canvas, BorderLayout.CENTER);
		universe = new SimpleUniverse(canvas);

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.Engine3D#init(java.lang.Object, java.lang.Object)
	 * 
	 * @author cosmin
	 */
	@Override
	public void init(Geometry geometry, Object appearance) {

		// Load the geometry and appearance
		this.loader = new GeometryAndAppearanceLoader(geometry, appearance);

		// Set up the viewer looking into the scene.
		universe.getViewingPlatform().setNominalViewingTransform();
		TransformGroup VpTG = universe.getViewingPlatform().getViewPlatformTransform();
		float Zcamera = 20; // put the camera 12 meters back
		Transform3D cameraTransformation = new Transform3D();
		cameraTransformation.setTranslation(new Vector3f(0.0f, 0.0f, Zcamera));
		VpTG.setTransform(cameraTransformation);

		// Create the initial scene and add it to the graph
		sceneRoot = createSceneGraph();
		universe.addBranchGraph(sceneRoot);

		// Initialize other objects
		runningAnimations = new HashMap<RuntimeToken, RunningAnimation>();

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
		BranchGroup nodeRoot = new BranchGroup();

		// Add representations for the static objects
		Group trackGroup = new Group();
		for (String label : loader.getGeometryLabels()) {

			// Get the tracks and their coordinates
			GeometryObject obj = loader.getGeometryObject(label);
			if (!(obj instanceof Track))
				continue;
			Track track = (Track) obj;
			TrackPosition firstPoint = track.getContains().get(0);
			TrackPosition lastPoint = track.getContains().get(track.getContains().size() - 1);

			// Show the tracks
			LineArray lineArr = new LineArray(2, LineArray.COORDINATES);
			lineArr.setCoordinate(0, new Point3d(firstPoint.getX(), firstPoint.getY(), DRAWING_PLANE_Z));
			lineArr.setCoordinate(1, new Point3d(lastPoint.getX(), lastPoint.getY(), DRAWING_PLANE_Z));

			// Add the line to the track group
			Shape3D plShape = new Shape3D(lineArr);
			trackGroup.addChild(plShape);
		}
		nodeRoot.addChild(trackGroup);

		// Compile to perform optimizations on this content branch.
		nodeRoot.setCapability(BranchGroup.ALLOW_CHILDREN_EXTEND);
		nodeRoot.setCapability(BranchGroup.ALLOW_CHILDREN_WRITE);
		nodeRoot.compile();

		return nodeRoot;
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
	public void startAnimation(RuntimeToken token, Place place) {
		// TODO: Update all types of animations

		// Get the associated geometry
		GeometryObject geometryObj = loader.getGeometryObject(place.getGeometryLabel());
		if (!(geometryObj instanceof Track)) {
			log.severe("Starting animation for token " + token + " on place with wrong type of geometry: "
					+ geometryObj);
			return;
		}
		Track track = (Track) geometryObj;

		// See if there is already an object representation for the token
		RunningAnimation animation;
		animation = runningAnimations.get(token);
		if (animation == null) {

			// Create a BranchGroup for this Move animation, which will contain the Token Representation, the
			// interpolator for the animation and a behavior to clean up when the animation is finished
			BranchGroup animationsRoot = new BranchGroup();
			animationsRoot.setCapability(BranchGroup.ALLOW_DETACH);

			// Create the TransformGroup node, which is writable to support animation
			TransformGroup tokenRepresGroup = new TransformGroup();
			tokenRepresGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
			animationsRoot.addChild(tokenRepresGroup);

			// Create the token representation node (color cube) and add it to the group
			// TODO: Eventually get info from Place
			tokenRepresGroup.addChild(new ColorCube(0.2));

			// Save the running animation for future use
			animation = new RunningAnimation(track, tokenRepresGroup, animationsRoot, 0);
			runningAnimations.put(token, animation);

		}

		/** Start the animation **/
		// Get the track points and their coordinates
		TrackPosition firstPoint = track.getContains().get(0);
		TrackPosition lastPoint = track.getContains().get(track.getContains().size() - 1);

		// Put the token representation at the beginning of the path
		Transform3D initTransform = new Transform3D();
		initTransform.setTranslation(new Vector3d(firstPoint.getX(), firstPoint.getY(), DRAWING_PLANE_Z));
		animation.transformGroup.setTransform(initTransform);

		// Create a Behavior (Interpolator) node that moves the cube and add it to the scene
		Transform3D yAxis = new Transform3D();
		Alpha timing = new Alpha(1, 4000);
		timing.setStartTime(new Date().getTime());
		timing.setMode(Alpha.INCREASING_ENABLE);
		Point3f startPoint = new Point3f(new Point3d(firstPoint.getX(), firstPoint.getY(), DRAWING_PLANE_Z));
		Point3f endPoint = new Point3f(new Point3d(lastPoint.getX(), lastPoint.getY(), DRAWING_PLANE_Z));
		PositionPathInterpolator nodePositionInterpolator = new PositionPathInterpolator(timing,
				animation.transformGroup, yAxis, new float[] { 0, 1 }, new Point3f[] { startPoint, endPoint });
		BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
		nodePositionInterpolator.setSchedulingBounds(bounds);
		animation.animationBranchGroup.addChild(nodePositionInterpolator);

		// Create a behavior that handles the finish of the animation
		FinishAnimationBehavior beh = new FinishAnimationBehavior(this, animation, token, 4000);
		animation.animationBranchGroup.addChild(beh);

		// Add the branch to the root
		sceneRoot.addChild(animation.animationBranchGroup);
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
	protected BranchGroup getSceneRoot() {
		return sceneRoot;
	}

	/**
	 * Run when the animation for a token is finished. Notifies the listener.
	 * 
	 * @param token the token
	 */
	protected void animationFinished(RuntimeToken token) {
		engineListener.onAnimationFinished(token);
	}
}
