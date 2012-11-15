package se2.e.engine3d.j3d.animations;

import javax.media.j3d.WakeupCondition;

import animations.Animation;

import se2.e.engine3d.j3d.DynamicBranch;
import se2.e.simulator.runtime.petrinet.RuntimeToken;

/**
 * The Class RuntimeAnimation.
 * 
 * @author cosmin
 */
public abstract class RuntimeAnimation {

	/** The target branch. */
	private DynamicBranch targetBranch;

	/** The animation. */
	private Animation animation;

	/** The associated runtime token. */
	private RuntimeToken token;

	/**
	 * Inits the runtime animation. Usually, after initialization, a call to
	 * {@link RuntimeAnimation#onUpdateAnimation()} will be performed, to update the animation and to set up next wakeup
	 * conditions.
	 * 
	 * @return the wakeup condition defining when it should first update the animation.
	 */
	public abstract void init();

	/**
	 * Method called at when the behavior set up in the initialization or in a previous call to this method is
	 * triggered. Should update the Java3D graph and return a {@link WakeupCondition} stating when it should be
	 * triggered again.
	 * <p>
	 * Also this method must make the verification for finishing of animation and, if needed, call the
	 * 
	 * @return the wakeup condition defining when it should be called again.
	 * {@link RuntimeAnimation#onAnimationFinished()} method.
	 * </p>
	 */
	public abstract WakeupCondition onUpdateAnimation();

	/**
	 * Method called when this animation is finished.
	 */
	protected abstract void onAnimationFinished();

	/**
	 * Instantiates a new runtime animation.
	 * 
	 * @param targetBranch the target branch
	 * @param animation the animation
	 * @param token the token
	 */
	public RuntimeAnimation(DynamicBranch targetBranch, Animation animation, RuntimeToken token) {
		super();
		this.targetBranch = targetBranch;
		this.token = token;
		this.animation = animation;
		init();
	}

	/**
	 * Gets the target branch.
	 * 
	 * @return the target branch
	 */
	public DynamicBranch getTargetBranch() {
		return targetBranch;
	}

	/**
	 * Gets the animation.
	 * 
	 * @return the animation
	 */
	public Object getAnimation() {
		return animation;
	}

	/**
	 * Gets the associated runtime token.
	 * 
	 * @return the token
	 */
	public RuntimeToken getToken() {
		return token;
	}
}
