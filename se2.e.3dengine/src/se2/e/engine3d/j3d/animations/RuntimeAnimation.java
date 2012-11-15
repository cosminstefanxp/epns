package se2.e.engine3d.j3d.animations;

import java.util.Enumeration;

import javax.media.j3d.Behavior;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.WakeupCondition;
import javax.vecmath.Point3d;

import se2.e.engine3d.j3d.DynamicBranch;
import se2.e.engine3d.j3d.J3DEngine;
import se2.e.simulator.runtime.petrinet.RuntimeToken;

/**
 * The Class RuntimeAnimation.
 * 
 * @author cosmin
 */
public abstract class RuntimeAnimation<T> extends Behavior {

	/** The target branch. */
	protected DynamicBranch targetBranch;

	/** The animation. */
	protected T animation;

	/** The associated runtime token. */
	protected RuntimeToken token;

	/** The engine. */
	protected J3DEngine engine;

	/**
	 * Inits the runtime animation. Usually, after initialization, a call to
	 * 
	 * @return the wakeup condition defining when it should first update the animation.
	 * {@link RuntimeAnimation#onUpdateAnimation()} will be performed, to update the animation and to set up next wakeup
	 * conditions.
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
	 * @param engine the engine
	 */
	public RuntimeAnimation(DynamicBranch targetBranch, T animation, RuntimeToken token, J3DEngine engine) {
		super();
		this.targetBranch = targetBranch;
		this.token = token;
		this.animation = animation;
		this.engine = engine;
		init();
		
		// Connect the behavior to the branch group
		this.targetBranch.setBehaviorNode(this);
		this.targetBranch.getBranchGroup().addChild(this);
		
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

	@Override
	public void initialize() {
		System.out.println("Initialize behavior...");
		init();
		WakeupCondition criteria = onUpdateAnimation();
		wakeupOn(criteria);
		BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 1000.0);
		this.setSchedulingBounds(bounds);
	}

	@Override
	public void processStimulus(@SuppressWarnings("rawtypes") Enumeration inCriteria) {
		System.out.println("Stimulus...");
		WakeupCondition criteria = onUpdateAnimation();
		if(criteria!=null)
			wakeupOn(criteria);
	}
}
