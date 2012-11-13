package se2.e.engine3d;

import geometry.Geometry;
import petrinet.Place;
import se2.e.simulator.runtime.petrinet.RuntimeToken;

/**
 * The Engine3D displays information from the Petri net simulation to the user.
 * 
 * @author cosmin
 */

public interface Engine3D {

	/**
	 * Inits the engine.
	 * 
	 * @param geometry the geometry
	 * @param appearance the appearance config
	 */
	// TODO: Proper parameters
	public void init(Geometry geometry, Object appearance);

	/**
	 * Starts an animation.
	 *
	 * @param token the token
	 * @param animation the animation
	 */
	public void startAnimation(RuntimeToken token, Object animation);

	/**
	 * Sets the engine 3D listener. For now, there can only be one active 3D listener.
	 * 
	 * @param listener the new Engine 3d listener
	 */
	public void setEngine3DListener(Engine3DListener listener);
}
