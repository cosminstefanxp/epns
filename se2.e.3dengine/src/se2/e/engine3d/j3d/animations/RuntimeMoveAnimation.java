package se2.e.engine3d.j3d.animations;

import javax.media.j3d.WakeupCondition;
import javax.media.j3d.WakeupOnElapsedFrames;

import se2.e.engine3d.j3d.DynamicBranch;
import se2.e.engine3d.j3d.J3DEngine;
import se2.e.simulator.runtime.petrinet.RuntimeToken;
import animations.Animation;

/**
 * The Class RuntimeMoveAnimation.
 */
public class RuntimeMoveAnimation extends RuntimeAnimation {

	/** The Constant UPDATE_FRAME_COUNT. */
	private static final int UPDATE_FRAME_COUNT = 10;

	/**
	 * Instantiates a new runtime move animation.
	 * 
	 * @param targetBranch the target branch
	 * @param animation the animation
	 * @param token the token
	 * @param engine the engine
	 */
	public RuntimeMoveAnimation(DynamicBranch targetBranch, Animation animation, RuntimeToken token, J3DEngine engine) {
		super(targetBranch, animation, token, engine);
	}

	@Override
	public void init() {

	}

	@Override
	public WakeupCondition onUpdateAnimation() {
		return new WakeupOnElapsedFrames(UPDATE_FRAME_COUNT);
	}

	@Override
	protected void onAnimationFinished() {
		System.out.println("Animation Finished.");
		engine.getSceneRoot().removeChild(this.targetBranch.getBranchGroup());
		engine.animationFinished(token);
	}

}
