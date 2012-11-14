package se2.e.geometry.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import se2.e.geometry.diagram.providers.GeometryElementTypes;

/**
 * @generated
 */
public class TrackItemSemanticEditPolicy extends GeometryBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TrackItemSemanticEditPolicy() {
		super(GeometryElementTypes.Track_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
