package se2.e.geometry.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import experiment.QuadraticBezier;
import experiment.QuadraticBezierFromPath;

import se2.e.geometry.diagram.edit.policies.TrackItemSemanticEditPolicy;

/**
 * @generated
 */
public class TrackEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public TrackEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new TrackItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TrackLabelEditPart) {
			((TrackLabelEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureTrackLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof TrackLabelEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new TrackFigure();
	}

	/**
	 * @generated
	 */
	public TrackFigure getPrimaryShape() {
		return (TrackFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class TrackFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTrackLabelFigure;

		/**
		 * @generated
		 */
		public TrackFigure() {
			this.setForegroundColor(THIS_FORE);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTrackLabelFigure = new WrappingLabel();

			fFigureTrackLabelFigure.setText("<...>");

			this.add(fFigureTrackLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTrackLabelFigure() {
			return fFigureTrackLabelFigure;
		}

		/**
		 * @generated NOT
		 * @author Jerome and Georgios
		 */
		@Override
		// TODO : change the interpolator when anders will have finished
		public PointList getSmoothPoints(boolean calculateAppoxPoints) {
			//return QuadraticBezier.allPoints(this.getPoints());
			return QuadraticBezierFromPath.allPoints(this.getPoints());
		}
	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}
