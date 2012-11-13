package se2.e.simulator.runtime.petrinet;

import petrinet.Place;

/**
 * The Class TokenMovement.
 * @author Ruxandra, Marius
 */
public class TokenMovement {
	
	/** The token. */
	private RuntimeToken token;
	
	/** The place. */
	private Place place;
	
	/**
	 * Instantiates a new token movement.
	 *
	 * @param token the token
	 * @param place the place
	 */
	public TokenMovement(RuntimeToken token, Place place) {
		super();
		this.setToken(token);
		this.setPlace(place);
	}

	/**
	 * Gets the token.
	 *
	 * @return the token
	 */
	public RuntimeToken getToken() {
		return token;
	}

	/**
	 * Sets the token.
	 *
	 * @param token the new token
	 */
	public void setToken(RuntimeToken token) {
		this.token = token;
	}

	/**
	 * Gets the place.
	 *
	 * @return the place
	 */
	public Place getPlace() {
		return place;
	}

	/**
	 * Sets the place.
	 *
	 * @param place the new place
	 */
	public void setPlace(Place place) {
		this.place = place;
	}
}
