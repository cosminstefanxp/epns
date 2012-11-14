package se2.e.engine3d.runtime;

import se2.e.utilities.Where;

/**
 * An animated object encapsulates a Java 3D branch group
 * @author anders
 *
 */
public abstract class AnimatedObject {
	private Animation animation = null;
	
	protected void onTick() {
		if (animation == null) return;
		animation.recalculate();
		}
	
	protected void onClick() {
		
		}
	
	/**
	 * Returns the tick.
	 * The tick can be the frame number or any other integer value
	 * indicating progress in time.
	 * 
	 * @return the tick.
	 */
	public abstract long getTick();
	
	/**
	 * Move the animated object to a specific position.
	 * 
	 * This method will be called by the animation.
	 * 
	 * @param position where to place the animated object.
	 */
	public abstract void moveTo(Where position);
	
	public void setAnimation(Animation animation) {
		this.animation = animation;
		}
	
	}
