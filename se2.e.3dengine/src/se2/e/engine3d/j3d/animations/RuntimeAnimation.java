package se2.e.engine3d.j3d.animations;

import javax.media.j3d.WakeupCondition;

import se2.e.engine3d.j3d.DynamicBranch;

/**
 * The Class RuntimeAnimation.
 * 
 * @author cosmin
 */
public abstract class RuntimeAnimation {

	/** The target branch. */
	private DynamicBranch targetBranch;

	/** The animation. */
	private Object animation;

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
	 * {@link RuntimeAnimation#onAnimationFinished()} method.
	 * </p>
	 * 
	 * @return the wakeup condition defining when it should be called again.
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
	 */
	public RuntimeAnimation(DynamicBranch targetBranch, Object animation) {
		super();
		this.targetBranch = targetBranch;
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
}
