package se2.e.engine3d.j3d.animations;

import java.util.logging.Logger;

import se2.e.engine3d.j3d.DynamicBranch;
import se2.e.simulator.runtime.petrinet.RuntimeToken;
import animations.Animation;
import animations.Move;

public class RuntimeAnimationFactory {

	/**
	 * Gets the runtime animation that corresponds with a given {@link Animation}.
	 * 
	 * @param targetBranch the target branch, same as the parameters for {@link RuntimeAnimation}
	 * @param animation the animation
	 * @return the runtime animation
	 */
	public static RuntimeAnimation getRuntimeAnimation(DynamicBranch targetBranch, Animation animation, RuntimeToken token) {
		if (animation instanceof Move) {
			return new RuntimeMoveAnimation(targetBranch, animation, token);
		}

		Logger.getAnonymousLogger().warning(
				"RuntimeAnimationFactory could not create RuntimeAnimation for " + animation);
		return null;
	}
}
