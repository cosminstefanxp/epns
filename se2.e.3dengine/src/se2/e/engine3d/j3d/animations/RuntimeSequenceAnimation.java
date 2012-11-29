package se2.e.engine3d.j3d.animations;

import java.util.logging.Logger;

import javax.media.j3d.WakeupCondition;

import se2.e.engine3d.j3d.DynamicBranch;
import se2.e.engine3d.j3d.J3DEngine;
import se2.e.simulator.runtime.petrinet.RuntimeToken;
import animations.Sequence;

/**
 * The Class RuntimeSequenceAnimation implementing the RuntimeAnimation for a {@link Sequence} animation.
 * 
 * @author cosmin
 */
public class RuntimeSequenceAnimation extends RuntimeAnimation<Sequence> implements RuntimeAnimationListener {

	/** The current animation index. */
	private int currentAnimationIndex;

	/** The current runtime animation. */
	private RuntimeAnimation<?> currentRuntimeAnimation;

	/** The engine. */
	private J3DEngine engine;

	/** The geometry label. */
	private String geometryLabel;

	/**
	 * Instantiates a new runtime sequence animation.
	 * 
	 * @param targetBranch the target branch
	 * @param animation the animation
	 * @param token the token
	 * @param engine the engine
	 * @param geometryLabel the geometry label
	 */
	public RuntimeSequenceAnimation(DynamicBranch targetBranch, Sequence animation, RuntimeToken token,
			J3DEngine engine, RuntimeAnimationListener listener, String geometryLabel) {
		super(targetBranch, animation, token, listener, false);
		this.engine = engine;
		this.geometryLabel = geometryLabel;

		log.info("Starting sequence with animations: " + animation.getComponents());

		// Start the first animation
		currentAnimationIndex = 0;

		// Register itself as RuntimeAnimationListener for children animations
		currentRuntimeAnimation = RuntimeAnimationFactory.buildRuntimeAnimation(getTargetBranch(), animation
				.getComponents().get(0), getToken(), this.engine, this, geometryLabel);
		currentRuntimeAnimation.setAnimationListener(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimation#init()
	 */
	@Override
	public WakeupCondition init() {
		Logger.getAnonymousLogger().warning("Initializing Sequence Behavior. Should not reach this point.");

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimation#onUpdateAnimation()
	 */
	@Override
	public WakeupCondition onUpdateAnimation() {
		Logger.getAnonymousLogger().warning("Sequence OnUpdateAnimation... Should not reach this point.");
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimation#onAnimationFinished()
	 */
	@Override
	protected void onAnimationFinished() {
		Logger.getAnonymousLogger().warning("Sequence OnAnimationFinished... Should not reach this point.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimationListener#animationFinished(se2.e.simulator.runtime.petrinet.
	 * RuntimeToken)
	 */
	@Override
	public void animationFinished(RuntimeToken token) {
		log.info("Finished Animation in Sequence: " + currentRuntimeAnimation);
		// If there are more animations, start the next one
		if (currentAnimationIndex < animation.getComponents().size() - 1) {
			currentAnimationIndex++;
			currentRuntimeAnimation = RuntimeAnimationFactory.buildRuntimeAnimation(getTargetBranch(), animation
					.getComponents().get(currentAnimationIndex), getToken(), engine, this, geometryLabel);
			currentRuntimeAnimation.setAnimationListener(this);
		} else {
			log.info("Sequence Animation finished for token: " + getToken());
			this.animationListener.animationFinished(getToken());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimationListener#isPaused()
	 */
	@Override
	public boolean isPaused() {
		return animationListener.isPaused();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * se2.e.engine3d.j3d.animations.RuntimeAnimationListener#attachToRoot(se2.e.engine3d.j3d.animations.RuntimeAnimation
	 * )
	 */
	@Override
	public void attachToRoot(RuntimeAnimation<?> animation) {
		animationListener.attachToRoot(animation);
	}

}
