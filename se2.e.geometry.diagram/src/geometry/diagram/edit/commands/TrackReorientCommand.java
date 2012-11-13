package geometry.diagram.edit.commands;

import geometry.Geometry;
import geometry.Track;
import geometry.TrackPosition;
import geometry.diagram.edit.policies.GeometryBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class TrackReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public TrackReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Track) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof TrackPosition && newEnd instanceof TrackPosition)) {
			return false;
		}
		TrackPosition target = getLink().getEndPosition();
		if (!(getLink().eContainer() instanceof Geometry)) {
			return false;
		}
		Geometry container = (Geometry) getLink().eContainer();
		return GeometryBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTrack_4001(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof TrackPosition && newEnd instanceof TrackPosition)) {
			return false;
		}
		TrackPosition source = getLink().getStartPosition();
		if (!(getLink().eContainer() instanceof Geometry)) {
			return false;
		}
		Geometry container = (Geometry) getLink().eContainer();
		return GeometryBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTrack_4001(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setStartPosition(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setEndPosition(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Track getLink() {
		return (Track) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected TrackPosition getOldSource() {
		return (TrackPosition) oldEnd;
	}

	/**
	 * @generated
	 */
	protected TrackPosition getNewSource() {
		return (TrackPosition) newEnd;
	}

	/**
	 * @generated
	 */
	protected TrackPosition getOldTarget() {
		return (TrackPosition) oldEnd;
	}

	/**
	 * @generated
	 */
	protected TrackPosition getNewTarget() {
		return (TrackPosition) newEnd;
	}
}
