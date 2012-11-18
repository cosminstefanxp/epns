package se2.e.engine3d.j3d;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.media.j3d.Behavior;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransformGroup;

import com.sun.j3d.utils.picking.PickCanvas;
import com.sun.j3d.utils.picking.PickResult;

/**
 * The DynamicBranch holds all the required references for a dynamic object represented in the 3D space. It is only a
 * holder and it's the responsibility of the user to make the appropriate connections.
 * 
 * @author cosmin
 */
public class DynamicBranch implements MouseListener {
	
	/** The {@link TransformGroup} holding the 3D object. */
	private TransformGroup transformGroup;

	/** The branch group. */
	private BranchGroup branchGroup;
	
	/** The Java 3D engine */
	private J3DEngine engine;

	/** the picking canvas */
	private PickCanvas pickCanvas;
	
	/** The Geometry label */
	private String geomLabel;

	/** The behavior node. */
	private Behavior behaviorNode;

	/**
	 * Gets the behavior node.
	 * 
	 * @return the behavior node
	 */
	public Behavior getBehaviorNode() {
		return behaviorNode;
	}

	
	/**
	 * Sets the behavior node.
	 * 
	 * @param behaviorNode the new behavior node
	 */
	public void setBehaviorNode(Behavior behaviorNode) {
		this.behaviorNode = behaviorNode;
	}

	/**
	 * Gets the transform group.
	 * 
	 * @return the transform group
	 */
	public TransformGroup getTransformGroup() {
		return transformGroup;
	}

	/**
	 * Gets the branch group.
	 * 
	 * @return the branch group
	 */
	public BranchGroup getBranchGroup() {
		return branchGroup;
	}

	/**
	 * Instantiates a new dynamic branch.
	 * 
	 * @param transformGroup the transform group
	 * @param branchGroup the branch group
	 */
	public DynamicBranch(BranchGroup branchGroup, TransformGroup transformGroup) {
		super();
		this.transformGroup = transformGroup;
		this.branchGroup = branchGroup;
		this.behaviorNode = null;
		this.engine = null;
		this.pickCanvas = null;
		
	}
	
	/**
	 * Instantiates a new dynamic branch with user input capability
	 *
	 * @param branchGroup the branch group
	 * @param transformGroup the transform group
	 * @param geomLabel the geom label
	 * @param engine the engine
	 * @param canvas the canvas
	 */
	public DynamicBranch( BranchGroup branchGroup,
			TransformGroup transformGroup,String geomLabel,
			J3DEngine engine, Canvas3D canvas ) {
		super();
		this.geomLabel = geomLabel;
		this.transformGroup = transformGroup;
		this.branchGroup = branchGroup;
		this.engine = engine;
		this.behaviorNode = null;
		pickCanvas = new PickCanvas(canvas, this.branchGroup);
		pickCanvas.setMode(PickCanvas.GEOMETRY);
		canvas.addMouseListener(this);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		pickCanvas.setShapeLocation(e);

	    PickResult result = pickCanvas.pickClosest();

	    if (result == null) {

	       System.out.println("Nothing picked");

	    } else {
	       Shape3D s = (Shape3D)result.getNode(PickResult.SHAPE3D);

	       if (s != null) {
	    	  //TODO: add more interesting behaviour
	    	   engine.userInteraction(this.geomLabel);
	           System.out.println("Picked " + s.getClass().getName());

	       } else{
	          System.out.println("null");
	       }
	    }
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
