package se2.e.geometry.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import se2.e.geometry.diagram.edit.commands.SimplePositionCreateCommand;
import se2.e.geometry.diagram.edit.commands.TrackPositionCreateCommand;
import se2.e.geometry.diagram.providers.GeometryElementTypes;

/**
 * @generated
 */
public class GeometryItemSemanticEditPolicy extends GeometryBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GeometryItemSemanticEditPolicy() {
		super(GeometryElementTypes.Geometry_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GeometryElementTypes.SimplePosition_2001 == req.getElementType()) {
			return getGEFWrapper(new SimplePositionCreateCommand(req));
		}
		if (GeometryElementTypes.TrackPosition_2002 == req.getElementType()) {
			return getGEFWrapper(new TrackPositionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
