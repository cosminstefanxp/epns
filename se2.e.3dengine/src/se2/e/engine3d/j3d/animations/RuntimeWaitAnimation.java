package se2.e.engine3d.j3d.animations;

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
		super(targetBranch, animation, token, listener, true);

		// Attach itself to the Scene graph
		listener.attachToRoot(this);
	}

	@Override
	public WakeupCondition init() {
		log.info("Initializing RuntimeWaitAnimation...");
		return new WakeupOnElapsedTime((long) animation.getTime());
	}

	@Override
	public WakeupCondition onUpdateAnimation() {
		onAnimationFinished();
		return null;
	}

	@Override
	protected void onAnimationFinished() {
		log.info("Finishing Wait Animation...");
		this.animationListener.animationFinished(getToken());
	}

}
