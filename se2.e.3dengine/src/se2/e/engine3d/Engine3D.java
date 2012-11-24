package se2.e.engine3d;

import java.util.Set;

import se2.e.geometry.Geometry;
import se2.e.simulator.runtime.petrinet.RuntimeToken;
import animations.Animation;
import appearance.AppearanceModel;

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
	 * @param inputPlacesLabels the input places labels
	 */
	public void init(Geometry geometry, AppearanceModel appearance, Set<String> inputPlacesLabels);

	/**
	 * Starts an animation.
	 * 
	 * @param token the token
	 * @param animation the animation
	 * @param geometryLabel the geometry label associated with the place, if any and if needed, or null otherwise
	 */
	public void startAnimation(RuntimeToken token, Animation animation, String geometryLabel);

	/**
	 * Destroy the representation associated with the token.
	 * 
	 * @param token the token
	 */
	public void destroyRepresentation(RuntimeToken token);

	/**
	 * Sets the engine 3D listener.
	 * 
	 * @param listener the new Engine 3d listener
	 */
	public void setEngine3DListener(Engine3DListener listener);
}
