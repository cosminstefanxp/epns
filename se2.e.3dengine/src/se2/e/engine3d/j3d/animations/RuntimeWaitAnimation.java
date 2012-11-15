package se2.e.engine3d.j3d.animations;

import java.util.logging.Logger;

import javax.media.j3d.WakeupCondition;
import javax.media.j3d.WakeupOnElapsedTime;

import animations.Wait;

import se2.e.engine3d.j3d.DynamicBranch;
import se2.e.engine3d.j3d.J3DEngine;
import se2.e.simulator.runtime.petrinet.RuntimeToken;

/**
 * The Class RuntimeWaitAnimation is a {@link RuntimeAnimation} implementation for {@link Wait} animation.
 * 
 * @author cosmin
 */
public class RuntimeWaitAnimation extends RuntimeAnimation<Wait> {

	/** The started. */
	boolean started = false;

	/**
	 * Instantiates a new runtime wait animation.
	 * 
	 * @param targetBranch the target branch
	 * @param animation the animation
	 * @param token the token
	 * @param engine the engine
	 */
	public RuntimeWaitAnimation(DynamicBranch targetBranch, Wait animation, RuntimeToken token, J3DEngine engine) {
		super(targetBranch, animation, token, engine);
	}

	@Override
	public void init() {
		started = false;
		Logger.getAnonymousLogger().info("Initializing RuntimeWaitAnimation...");
	}

	@Override
	public WakeupCondition onUpdateAnimation() {
		started = true;
		if (!started)
			return new WakeupOnElapsedTime((long) animation.getTime());
		else {
			onAnimationFinished();
			return null;
		}
	}

	@Override
	protected void onAnimationFinished() {
		Logger.getAnonymousLogger().info("Finishing Dummy Animation...");
		engine.getSceneRoot().removeChild(this.targetBranch.getBranchGroup());
		engine.animationFinished(token);
	}

}
