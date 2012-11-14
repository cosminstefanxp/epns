package se2.e.geometry.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import se2.e.geometry.diagram.part.GeometryVisualIDRegistry;

/**
 * @generated
 */
public class GeometryEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (GeometryVisualIDRegistry.getVisualID(view)) {

			case GeometryEditPart.VISUAL_ID:
				return new GeometryEditPart(view);

			case SimplePositionEditPart.VISUAL_ID:
				return new SimplePositionEditPart(view);

			case SimplePositionLabelEditPart.VISUAL_ID:
				return new SimplePositionLabelEditPart(view);

			case TrackPositionEditPart.VISUAL_ID:
				return new TrackPositionEditPart(view);

			case TrackEditPart.VISUAL_ID:
				return new TrackEditPart(view);

			case TrackLabelEditPart.VISUAL_ID:
				return new TrackLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
