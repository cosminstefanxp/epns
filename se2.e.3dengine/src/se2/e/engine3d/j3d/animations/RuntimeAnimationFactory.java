package se2.e.engine3d.j3d.animations;

import java.util.logging.Logger;

import se2.e.engine3d.j3d.DynamicBranch;
import se2.e.engine3d.j3d.J3DEngine;
import se2.e.simulator.runtime.petrinet.RuntimeToken;
import animations.Animation;
import animations.Move;

public class RuntimeAnimationFactory {

	/**
	 * Gets the runtime animation that corresponds with a given {@link Animation}.
	 * 
	 * @param targetBranch the target branch, same as the parameters for {@link RuntimeAnimation}
	 * @param animation the animation
	 * @param token the token
	 * @param engine the engine
	 * @return the runtime animation
	 */
	public static RuntimeAnimation<?> getRuntimeAnimation(DynamicBranch targetBranch, Animation animation,
			RuntimeToken token, J3DEngine engine) {
		if (animation instanceof Move) {
			Logger.getAnonymousLogger().info("Creating RuntimeMoveAnimation with: " + animation);
			return new RuntimeMoveAnimation(targetBranch, (Move) animation, token, engine);
		}

		Logger.getAnonymousLogger().warning(
				"RuntimeAnimationFactory could not create RuntimeAnimation for " + animation);
		return null;
	}
}
