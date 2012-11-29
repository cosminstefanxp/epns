package se2.e.engine3d.j3d.animations;

import java.util.Enumeration;
import java.util.logging.Logger;

import javax.media.j3d.Behavior;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.WakeupCondition;
import javax.vecmath.Point3d;

import se2.e.engine3d.j3d.DynamicBranch;
import se2.e.simulator.runtime.petrinet.RuntimeToken;

/**
 * The Class RuntimeAnimation.
 * 
 * @param <T> the generic type
 * @author cosmin
 */
public abstract class RuntimeAnimation<T> extends Behavior {

	/** The target branch. */
	private DynamicBranch targetBranch;

	/** The animation. */
	protected T animation;

	/** The associated runtime token. */
	private RuntimeToken token;

	/** The listener. */
	protected RuntimeAnimationListener animationListener;


	/** The Constant log. */
	protected static final Logger log = Logger.getLogger(RuntimeAnimation.class.getSimpleName());

	/**
	 * Inits the runtime animation. Usually, this is called in the initialization method of the Behavior associated with
	 * the animation.
	 * 
	 * @return the wakeup condition defining when it should first update the animation.
	 */
	public abstract WakeupCondition init();

	/**
	 * Method called when the behavior set up in the initialization or in a previous call to this method is triggered.
	 * Should update the Java3D visualization and return a {@link WakeupCondition} stating when it should be triggered
	 * again.
	 * <p>
	 * Also this method must make the verification for finishing of animation and, if needed, call its or its parents a
	 * {@link RuntimeAnimation#onAnimationFinished()} method.
	 * </p>
	 * 
	 * @return the wakeup condition defining when it should be called again.
	 */
	public abstract WakeupCondition onUpdateAnimation();

	/**
	 * Method called when this animation is finished.
	 * 
	 * @author cosmin
	 */
	protected abstract void onAnimationFinished();

	/**
	 * Instantiates a new runtime animation.
	 * 
	 * @param targetBranch the target branch
	 * @param animation the animation
	 * @param token the token
	 * @param animationListener the animation listener
	 * @author cosmin
	 */
	public RuntimeAnimation(DynamicBranch targetBranch, T animation, RuntimeToken token,
			RuntimeAnimationListener animationListener, boolean attachBehavior) {
		super();
		if (targetBranch != null)
			this.targetBranch = targetBranch;
		else
			this.targetBranch = new DynamicBranch(buildEmptyBranchGroup(), null);
		this.token = token;
		this.animation = animation;
		this.animationListener = animationListener;

		// Connect the behavior to the branch group, possibly replacing the existing one
		if (attachBehavior && this.targetBranch != null) {
			this.targetBranch.getBranchGroup().detach();
			if (this.targetBranch.getBehaviorNode() != null)
				this.targetBranch.getBranchGroup().removeChild(this.targetBranch.getBehaviorNode());
			this.targetBranch.setBehaviorNode(this);
			this.targetBranch.getBranchGroup().addChild(this);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.media.j3d.Behavior#initialize()
	 * 
	 * @author cosmin
	 */
	@Override
	public void initialize() {
		// Initialize the behavior and prepare first wake-up criterion
		Logger.getAnonymousLogger().info(
				"Initializing behavior corresponding to animation " + this.getClass().getSimpleName());
		WakeupCondition criteria = init();
		if (criteria == null) {
			onAnimationFinished();
			return;
		}
		wakeupOn(criteria);
		BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 10000.0);
		this.setSchedulingBounds(bounds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.media.j3d.Behavior#processStimulus(java.util.Enumeration)
	 * 
	 * @author cosmin
	 */
	@Override
	public void processStimulus(@SuppressWarnings("rawtypes") Enumeration inCriteria) {
		WakeupCondition criteria = onUpdateAnimation();
		if (criteria != null)
			wakeupOn(criteria);
	}

	/**
	 * Sets the animation listener.
	 * 
	 * @param animationListener the new animation listener
	 */
	protected void setAnimationListener(RuntimeAnimationListener animationListener) {
		this.animationListener = animationListener;
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
	 * Sets the target branch.
	 * 
	 * @param targetBranch the new target branch
	 */
	protected void setTargetBranch(DynamicBranch targetBranch) {
		this.targetBranch = targetBranch;
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


	/**
	 * Builds an empty branch group.
	 * 
	 * @return the branch group
	 */
	private static BranchGroup buildEmptyBranchGroup() {
		BranchGroup bg = new BranchGroup();
		bg.setCapability(BranchGroup.ALLOW_DETACH);
		return bg;
	}
}
