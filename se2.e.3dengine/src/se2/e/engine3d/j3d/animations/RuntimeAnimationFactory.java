package se2.e.engine3d.j3d.animations;

import java.util.logging.Logger;

import se2.e.engine3d.j3d.DynamicBranch;
import se2.e.engine3d.j3d.J3DEngine;
import se2.e.simulator.runtime.petrinet.RuntimeToken;
import animations.Animation;
import animations.Move;
import animations.Sequence;
import animations.Show;
import animations.Wait;

/**
 * A factory for creating RuntimeAnimation objects.
 */
public class RuntimeAnimationFactory {

	/**
	 * Gets the runtime animation that corresponds with a given {@link Animation}.
	 * 
	 * @param targetBranch the target branch, same as the parameters for {@link RuntimeAnimation}
	 * @param animation the animation
	 * @param token the token
	 * @param engine the listener
	 * @param geometryLabel the geometry label associated with the place where the animation will be executed, if any
	 * and if needed, or null otherwise
	 * @return the runtime animation
	 * @author cosmin
	 */
	public static RuntimeAnimation<?> buildRuntimeAnimation(DynamicBranch targetBranch, Animation animation,
			RuntimeToken token, J3DEngine engine, String geometryLabel) {

		if (animation instanceof Move) {
			Logger.getAnonymousLogger().info("Creating RuntimeMoveAnimation with: " + animation);
			// Checks
			if (geometryLabel == null) {
				Logger.getAnonymousLogger().severe("No geometry set on place, for Move animation.");
				return new RuntimeDummyAnimation(targetBranch, animation, token, engine);
			}

			return new RuntimeMoveAnimation(targetBranch, (Move) animation, token, engine,
					engine.getGeometryAndAppearanceLoader(), geometryLabel, engine.getNodeFactory());
		}

		if (animation instanceof Show) {
			Logger.getAnonymousLogger().info("Creating RuntimeShowAnimation with: " + animation);
			// Checks
			if (geometryLabel == null) {
				Logger.getAnonymousLogger().severe("No geometry set on place, for Show animation.");
				return new RuntimeDummyAnimation(targetBranch, animation, token, engine);
			}

			// If there's no target branch, create one now for the token's appearance
			if (targetBranch == null)
				targetBranch = engine.getNodeFactory().getTokenBranch(token.getLabel(), null);
			else
			// If there's no transform group for the token, create it now
			if (targetBranch.getTransformGroup() == null)
				engine.getNodeFactory().getTokenBranch(token.getLabel(), targetBranch);

			return new RuntimeShowAnimation(targetBranch, (Show) animation, token, engine);
		}

		if (animation instanceof Wait) {
			Logger.getAnonymousLogger().info("Creating RuntimeWaitAnimation with: " + animation);
			return new RuntimeWaitAnimation(targetBranch, (Wait) animation, token, engine);
		}

		if (animation instanceof Sequence) {
			Logger.getAnonymousLogger().info("Creating RuntimeSequenceAnimation with: " + animation);
			return new RuntimeSequenceAnimation(targetBranch, (Sequence) animation, token, engine, geometryLabel);
		}

		Logger.getAnonymousLogger().warning(
				"RuntimeAnimationFactory could not create RuntimeAnimation for " + animation);
		return new RuntimeDummyAnimation(targetBranch, animation, token, engine);
	}

}
