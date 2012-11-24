package se2.e.simulator.runtime.petrinet;

import animations.Animation;

/**
 * The Class TokenMovement.
 * @author Ruxandra, Marius
 */
public class TokenMovement {


	/** The token. */
	private RuntimeToken token;
	
	/** The place. */
	private String geoLabel;
	
	private Animation animation;
	
	private boolean isDestroyed;
	
	
	

	/**
	 * @param token
	 * @param place
	 * @param animation
	 * @param destroyed
	 */
	public TokenMovement(RuntimeToken token, String place, Animation animation, boolean destroyed) {
		super();
		this.token = token;
		this.setGeoLabel(place);
		this.animation = animation;
		this.setDestroyed(destroyed);
	}

	public RuntimeToken getToken() {
		return token;
	}

	public void setToken(RuntimeToken token) {
		this.token = token;
	}



	public Animation getAnimation() {
		return animation;
	}

	public void setAnimation(Animation animation) {
		this.animation = animation;
	}



	/**
	 * @return the isDestroyed
	 */
	public boolean isDestroyed() {
		return isDestroyed;
	}

	/**
	 * @param isDestroyed the isDestroyed to set
	 */
	public void setDestroyed(boolean isDestroyed) {
		this.isDestroyed = isDestroyed;
	}



	/**
	 * @return the geoLabel
	 */
	public String getGeoLabel() {
		return geoLabel;
	}

	/**
	 * @param geoLabel the geoLabel to set
	 */
	public void setGeoLabel(String geoLabel) {
		this.geoLabel = geoLabel;
	}


	

}
