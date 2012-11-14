package se2.e.engine3d.runtime.annimations;

import java.util.ArrayList;
import java.util.List;

import se2.e.engine3d.runtime.AnimatedObject;
import se2.e.engine3d.runtime.Animation;

public class SequenceAnimation implements Animation {
	private Animation parent;
	private List<Animation> animations = new ArrayList<Animation>();
	private Animation activeAnimation = null;
	
	public SequenceAnimation(Animation... animations) {
		for (Animation animation : animations) add(animation);
		}

	public void add(Animation animation) {
		if (activeAnimation == null) activeAnimation = animation;
		animations.add(animation);
		}

	@Override
	public boolean recalculate() {
		// TODO: make sequence logic here
		return true;
		}

	@Override
	public void setParent(Animation parent) {
		this.parent = parent;
		}

	@Override
	public AnimatedObject getTarget() { return parent.getTarget(); }

	@Override
	public long getStartTick() { return parent.getStartTick(); }
	
	}
