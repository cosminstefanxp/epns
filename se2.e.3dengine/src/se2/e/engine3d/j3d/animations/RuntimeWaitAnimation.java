package se2.e.engine3d.j3d.animations;

import java.util.logging.Logger;

import javax.media.j3d.WakeupCondition;
import javax.media.j3d.WakeupOnElapsedTime;

import se2.e.engine3d.j3d.DynamicBranch;
import se2.e.simulator.runtime.petrinet.RuntimeToken;
import animations.Wait;

/**
 * The Class RuntimeWaitAnimation is a {@link RuntimeAnimation} implementation for {@link Wait} animation.
 * 
 * @author cosmin
 */
public class RuntimeWaitAnimation extends RuntimeAnimation<Wait> {

	/**
	 * Instantiates a new runtime wait animation.
	 * 
	 * @param targetBranch the target branch
	 * @param animation the animation
	 * @param token the token
	 * @param listener the listener
	 */
	public RuntimeWaitAnimation(DynamicBranch targetBranch, Wait animation, RuntimeToken token,
			RuntimeAnimationListener listener) {
		super(targetBranch, animation, token, listener);
	}

	@Override
	public WakeupCondition init() {
		Logger.getAnonymousLogger().info("Initializing RuntimeWaitAnimation...");
		return new WakeupOnElapsedTime((long) animation.getTime());
	}

	@Override
	public WakeupCondition onUpdateAnimation() {
		onAnimationFinished();
		return null;
	}

	@Override
	protected void onAnimationFinished() {
		Logger.getAnonymousLogger().info("Finishing Dummy Animation...");
		super.onAnimationFinished();
	}

}
