package se2.e.engine3d.j3d.animations;

import java.util.logging.Logger;

import javax.media.j3d.WakeupCondition;

import se2.e.engine3d.j3d.DynamicBranch;
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
	 */
	public RuntimeShowAnimation(DynamicBranch targetBranch, Show animation, RuntimeToken token,
			RuntimeAnimationListener listener) {
		super(targetBranch, animation, token, listener, false);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimation#onUpdateAnimation()
	 */
	@Override
	public WakeupCondition onUpdateAnimation() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimation#onAnimationFinished()
	 */
	@Override
	protected void onAnimationFinished() {
		Logger.getAnonymousLogger().info("Finishing Dummy Animation...");
		this.animationListener.animationFinished(getToken());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimation#init()
	 */
	@Override
	public WakeupCondition init() {
		Logger.getAnonymousLogger().warning("Starting Dummy Animation...");
		onAnimationFinished();
		return null;
	}

}
