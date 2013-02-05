package se2.e.engine3d.j3d.animations;

import javax.media.j3d.WakeupCondition;

import se2.e.engine3d.j3d.DynamicBranch;
import se2.e.engine3d.j3d.J3DEngine;
import se2.e.simulator.runtime.petrinet.RuntimeToken;
import animations.Show;

/**
 * The Class RuntimeShowAnimation implementing the {@link RuntimeAnimation} for a {@link Show} animation.
 * 
 * @author cosmin
 */
public class RuntimeShowAnimation extends RuntimeAnimation<Show> {

	/**
	 * Instantiates a new runtime show animation.
	 * 
	 * @param targetBranch the target branch
	 * @param animation the animation
	 * @param token the token
	 * @param listener the listener
	 * @author cosmin
	 */
	public RuntimeShowAnimation(DynamicBranch targetBranch, Show animation, RuntimeToken token,
			RuntimeAnimationListener listener, J3DEngine engine, String geometryLabel) {
		super(targetBranch, animation, token, listener, false);

		// Get the place representation
		DynamicBranch branch = engine.getPlaceRepresentation(geometryLabel);
		if (branch == null)
			branch = new DynamicBranch(RuntimeAnimation.buildEmptyBranchGroup(), null);

		if (branch.isAttachedToRoot()) {
			branch.getBranchGroup().detach();
			branch.setAttachedToRoot(false);
		}

		// Build the representation or replace the existing one
		if (branch.getTransformGroup() != null)
			branch.getTransformGroup().removeAllChildren();
		engine.getNodeFactory().getGeometryBranch(animation.getShape(), geometryLabel, branch);
		engine.attachPlaceRepresentation(geometryLabel, branch);
		
		log.fine("Show animation finished for :"+getToken());
		this.animationListener.animationFinished(getToken());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimation#onUpdateAnimation()
	 */
	@Override
	public WakeupCondition onUpdateAnimation() {
		log.severe("Hide Behavior should not run!");
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimation#onAnimationFinished()
	 */
	@Override
	protected void onAnimationFinished() {
		log.severe("Hide Behavior should not run!");
		this.animationListener.animationFinished(getToken());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimation#init()
	 */
	@Override
	public WakeupCondition init() {
		log.severe("Show Behavior should not run!");
		onAnimationFinished();
		return null;
	}

}
