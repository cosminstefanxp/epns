package se2.e.engine3d.j3d.animations;

import java.util.logging.Logger;

import javax.media.j3d.WakeupCondition;

import se2.e.engine3d.j3d.DynamicBranch;
import se2.e.simulator.runtime.petrinet.RuntimeToken;

/**
 * The Class RuntimeDummyAnimation is a dummy implementation for {@link RuntimeAnimation} that finishes instantly.
 * 
 * @author cosmin
 */
@SuppressWarnings("rawtypes")
public class RuntimeDummyAnimation extends RuntimeAnimation {

	/**
	 * Instantiates a new runtime dummy animation.
	 * 
	 * @param targetBranch the target branch
	 * @param animation the animation
	 * @param token the token
	 * @param listener the listener
	 */
	@SuppressWarnings("unchecked")
	public RuntimeDummyAnimation(DynamicBranch targetBranch, Object animation, RuntimeToken token,
			RuntimeAnimationListener listener) {
		super(targetBranch, animation, token, listener);
	}

	@Override
	public WakeupCondition init() {
		Logger.getAnonymousLogger().warning("Starting Dummy Animation...");
		onAnimationFinished();
		return null;
	}

	@Override
	public WakeupCondition onUpdateAnimation() {
		return null;
	}

	@Override
	protected void onAnimationFinished() {
		Logger.getAnonymousLogger().info("Finishing Dummy Animation...");
		super.onAnimationFinished();
	}

}
