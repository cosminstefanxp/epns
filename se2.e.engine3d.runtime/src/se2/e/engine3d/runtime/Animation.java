package se2.e.engine3d.runtime;

public interface Animation {

	void setParent(Animation parent);
	
	/**
	 * The target animated object of this animation.
	 * 
	 * @return the target.
	 */
	AnimatedObject getTarget();
	
	/**
	 * Get the tick from when this animation was created.
	 * 
	 * @return the start tick.
	 */
	long getStartTick();
	
	/**
	 * Recalculate the animated objects data.
	 * 
	 * Returns true if the animation is still running,
	 * otherwise false.
	 * 
	 * @return whether the animation is still running.
	 */
	public boolean recalculate();
	
	}
