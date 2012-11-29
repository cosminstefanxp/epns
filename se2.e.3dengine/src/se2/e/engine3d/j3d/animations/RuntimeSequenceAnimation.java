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
			J3DEngine engine, String geometryLabel) {
		super(targetBranch, animation, token, engine, true);
		this.engine = engine;
		this.geometryLabel = geometryLabel;

		// Attach itself to the Scene graph
		engine.attachToRoot(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimation#init()
	 */
	@Override
	public WakeupCondition init() {
		Logger.getAnonymousLogger().info("Initializing RuntimeSequenceAnimation...");

		// Start the first animation
		currentAnimationIndex = 0;

		// Register itself as RuntimeAnimationListener for children animations
		currentRuntimeAnimation = RuntimeAnimationFactory.buildRuntimeAnimation(getTargetBranch(), animation
				.getComponents().get(0), getToken(), engine, geometryLabel);
		currentRuntimeAnimation.setAnimationListener(this);

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimation#onUpdateAnimation()
	 */
	@Override
	public WakeupCondition onUpdateAnimation() {
		return currentRuntimeAnimation.onUpdateAnimation();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimation#onAnimationFinished()
	 */
	@Override
	protected void onAnimationFinished() {
		Logger.getAnonymousLogger().info("Finished Sequence Animation: " + currentRuntimeAnimation);
		// If there are more animations, start the next one
		if (currentAnimationIndex < animation.getComponents().size() - 1) {
			currentAnimationIndex++;
			currentRuntimeAnimation = RuntimeAnimationFactory.buildRuntimeAnimation(getTargetBranch(), animation
					.getComponents().get(currentAnimationIndex), getToken(), engine, geometryLabel);
			currentRuntimeAnimation.setAnimationListener(this);
		} else
			this.animationListener.animationFinished(getToken());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimationListener#animationFinished(se2.e.simulator.runtime.petrinet.
	 * RuntimeToken)
	 */
	@Override
	public void animationFinished(RuntimeToken token) {
		onAnimationFinished();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.j3d.animations.RuntimeAnimationListener#isPaused()
	 */
	@Override
	public boolean isPaused() {
		return engine.isPaused();
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
		engine.attachToRoot(animation);
	}

}
