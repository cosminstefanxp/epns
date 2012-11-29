package se2.e.engine3d.j3d.animations;

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
		super(targetBranch, animation, token, listener, false);
		log.warning("Initializing Dummy Behavior...");
		listener.animationFinished(token);
	}

	@Override
	public WakeupCondition init() {
		// Should not run, as this is not attached to the root
		log.severe("Dummy Behavior should not run!");
		return null;
	}

	@Override
	public WakeupCondition onUpdateAnimation() {
		// Should not run, as this is not attached to the root
		log.severe("Dummy Behavior should not run!");
		return null;
	}

	@Override
	protected void onAnimationFinished() {
		// Should not run, as this is not attached to the root
		log.severe("Dummy Behavior should not run!");
		this.animationListener.animationFinished(getToken());
	}

}
