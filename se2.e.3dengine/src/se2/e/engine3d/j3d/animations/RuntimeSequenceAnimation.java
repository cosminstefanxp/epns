package se2.e.engine3d.j3d.animations;

import javax.media.j3d.WakeupCondition;

import se2.e.engine3d.j3d.DynamicBranch;
import se2.e.engine3d.j3d.J3DEngine;
import se2.e.simulator.runtime.petrinet.RuntimeToken;
import animations.Animation;
import animations.Sequence;

public class RuntimeSequenceAnimation extends RuntimeAnimation<Sequence> {

	private int currentAnimationIndex;
	private Animation currentAnimation;

	public RuntimeSequenceAnimation(DynamicBranch targetBranch, Sequence animation, RuntimeToken token, J3DEngine engine) {
		super(targetBranch, animation, token, engine);
	}

	@Override
	public void init() {
		currentAnimationIndex = 0;
		currentAnimation = animation.getComponents().get(0);
	}

	@Override
	public WakeupCondition onUpdateAnimation() {
		
		return null;
	}

	@Override
	protected void onAnimationFinished() {
		if(currentAnimationIndex<animation.getComponents().size()-1)
		{
			
		}

	}

}
