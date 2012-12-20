package se2.e.engine3d.j3d;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Shape3D;
import javax.media.j3d.TransformGroup;

import com.sun.j3d.utils.picking.PickCanvas;
import com.sun.j3d.utils.picking.PickResult;

/**
 * The Class DynamicInputBranch that is a {@link DynamicBranch} that has a user input listener on the representation.
 * 
 * @author ruxy
 */
public class DynamicInputBranch extends DynamicBranch implements MouseListener {

	/** The Java 3D engine. */
	private J3DEngine engine;

	/** the picking canvas. */
	private PickCanvas pickCanvas;

	/** The Geometry label. */
	private String geomLabel;

	/**
	 * Instantiates a new dynamic branch with user input capability.
	 * 
	 * @param branchGroup the branch group
	 * @param transformGroup the transform group
	 * @param geomLabel the geom label
	 * @param engine the engine
	 * @param canvas the canvas
	 */
	public DynamicInputBranch(BranchGroup branchGroup, TransformGroup transformGroup, String geomLabel,
			J3DEngine engine, Canvas3D canvas) {
		super(branchGroup, transformGroup);
		this.geomLabel = geomLabel;
		this.engine = engine;
		pickCanvas = new PickCanvas(canvas, this.getBranchGroup());
		pickCanvas.setMode(PickCanvas.GEOMETRY);
		canvas.addMouseListener(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		pickCanvas.setShapeLocation(e);

		PickResult result = pickCanvas.pickClosest();
		if (result != null) {
			Shape3D s = (Shape3D) result.getNode(PickResult.SHAPE3D);
			if (s != null) {
				engine.userInteraction(this.geomLabel);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// No implementation
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseExited(MouseEvent arg0) {
		// No implementation
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
	 */
	@Override
	public void mousePressed(MouseEvent arg0) {
		// No implementation
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// No implementation
	}
}
