package se2.e.engine3d.j3d.animations;

import java.util.logging.Logger;

import javax.media.j3d.WakeupCondition;

import se2.e.engine3d.j3d.DynamicBranch;
import se2.e.engine3d.j3d.J3DEngine;
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
	 * @param engine the engine
	 */
	@SuppressWarnings("unchecked")
	public RuntimeDummyAnimation(DynamicBranch targetBranch, Object animation, RuntimeToken token, J3DEngine engine) {
		super(targetBranch, animation, token, engine);
	}

	@Override
	public void init() {
		Logger.getAnonymousLogger().warning("Starting Dummy Animation...");
	}

	@Override
	public WakeupCondition onUpdateAnimation() {
		onAnimationFinished();
		return null;
	}

	@Override
	protected void onAnimationFinished() {
		Logger.getAnonymousLogger().info("Finishing Dummy Animation...");
		engine.getSceneRoot().removeChild(this.targetBranch.getBranchGroup());
		engine.animationFinished(token);
	}

}
