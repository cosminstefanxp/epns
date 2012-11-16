package se2.e.engine3d.j3d.animations;

import se2.e.simulator.runtime.petrinet.RuntimeToken;

/**
 * The listener interface for receiving events related to the progress of {@link RuntimeAnimation}s. The class that is
 * interested in processing a runtimeAnimation process event implements this interface, and the object created with that
 * class is registered with a component using the component's
 * <code>setRuntimeAnimationListener<code> method or using any similar method. When
 * the RuntimeAnimation event occurs, that object's appropriate method is invoked.
 * 
 * @see RuntimeAnimation
 * @author cosmin
 */
public interface RuntimeAnimationListener {


	/**
	 * Method called when the animation for a token is finished.
	 * 
	 * @param token the token for which the animation has finished
	 */
	public void animationFinished(RuntimeToken token);
}
