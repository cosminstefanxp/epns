package se2.e.engine3d.j3d.animations;

import javax.media.j3d.WakeupCondition;

import animations.Hide;

import se2.e.engine3d.j3d.DynamicBranch;
import se2.e.simulator.runtime.petrinet.RuntimeToken;

/**
 * The Class RuntimeHideAnimation is the implementation for a RuntimeAnimation corresponding to the {@link Hide}
 * animation.
 * 
 * @author cosmin
 */
public class RuntimeHideAnimation extends RuntimeAnimation<Hide> {

	/**
	 * Instantiates a new runtime hide animation.
	 * 
	 * @param targetBranch the target branch
	 * @param animation the animation
	 * @param token the token
	 * @param listener the listener
	 */
	public RuntimeHideAnimation(DynamicBranch targetBranch, Hide animation, RuntimeToken token,
			RuntimeAnimationListener listener) {
		super(targetBranch, animation, token, listener, false);
		this.detachFromRoot();
		this.getTargetBranch().getBranchGroup().removeChild(this.getTargetBranch().getTransformGroup());
		this.getTargetBranch().setTransformGroup(null);
		log.info(this.getClass().getSimpleName() + " finished for token: " + this.getToken());
		listener.animationFinished(getToken());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimation#init()
	 */
	@Override
	public WakeupCondition init() {
		// Should not run, as this is not attached to the root
		log.severe("Hide Behavior should not run!");
		return null;
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

}
