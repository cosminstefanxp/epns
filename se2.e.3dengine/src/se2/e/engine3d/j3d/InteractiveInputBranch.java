package se2.e.engine3d.j3d;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransformGroup;

import com.sun.j3d.utils.geometry.Primitive;
import com.sun.j3d.utils.picking.PickCanvas;
import com.sun.j3d.utils.picking.PickResult;

/**
 * @author Ruxandra
 *
 */
public class InteractiveInputBranch implements MouseListener{
	
	/** The Geometry label */
	private String geomLabel;
	
	/** The {@link TransformGroup} holding the 3D object. */
	private TransformGroup transformGroup;

	/** The branch group. */
	private BranchGroup branchGroup;
	
	/** The Java 3D engine */
	private J3DEngine engine;


	/** the picking canvas */
	private PickCanvas pickCanvas;
	/**
	 * @param geomLabel
	 * @param transformGroup
	 * @param branchGroup
	 * @param engine
	 */
	public InteractiveInputBranch(String geomLabel,
			TransformGroup transformGroup, BranchGroup branchGroup,
			J3DEngine engine, Canvas3D canvas ) {
		super();
		this.geomLabel = geomLabel;
		this.transformGroup = transformGroup;
		this.branchGroup = branchGroup;
		this.engine = engine;
		pickCanvas = new PickCanvas(canvas, this.branchGroup);
		pickCanvas.setMode(PickCanvas.GEOMETRY);
		canvas.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		pickCanvas.setShapeLocation(e);

	    PickResult result = pickCanvas.pickClosest();

	    if (result == null) {

	       System.out.println("Nothing picked");

	    } else {
	       Shape3D s = (Shape3D)result.getNode(PickResult.SHAPE3D);

	       if (s != null) {
	    	  //TODO: add more interesting behaviour
	    	  // engine.userInteraction(this.geomLabel);
	           System.out.println("Picked " + s.getClass().getName());

	       } else{
	          System.out.println("null");

	       }

	    }   
				
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
