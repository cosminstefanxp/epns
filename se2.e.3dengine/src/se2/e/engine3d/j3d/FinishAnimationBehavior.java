package se2.e.engine3d.j3d;

import java.util.Enumeration;

import javax.media.j3d.Behavior;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.WakeupOnElapsedTime;
import javax.vecmath.Point3d;

import se2.e.simulator.runtime.petrinet.RuntimeToken;

/**
 * The Class FinishAnimationBehavior that is used to handle the cleanup after an animation has been finished. Deletes
 * the unnecessary animation BranchGroup from the scene graph and notifies the engine of an animation finished.
 * 
 * @author cosmin
 */
public class FinishAnimationBehavior extends Behavior {

	/** The duration. */
	private long duration;

	/** The engine. */
	private J3DEngine engine;

	/** The animation. */
	private RunningAnimation animation;

	/** The token. */
	private RuntimeToken token;

	/**
	 * Instantiates a new finish animation behavior.
	 * 
	 * @param engine the engine
	 * @param animation the animation
	 * @param duration the duration
	 */
	public FinishAnimationBehavior(J3DEngine engine, RunningAnimation animation, RuntimeToken token, long duration) {
		super();
		this.engine = engine;
		this.animation = animation;
		this.duration = duration;
		this.token = token;
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
		this.wakeupOn(new WakeupOnElapsedTime(duration));
		BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
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
	public void processStimulus(@SuppressWarnings("rawtypes") Enumeration criteria) {
		System.out.println("Animation Finished.");
		engine.getSceneRoot().removeChild(animation.animationBranchGroup);
		engine.animationFinished(token);
	}
}
