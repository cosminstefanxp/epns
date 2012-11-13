package se2.e.simulator.runtime.petrinet;

/**
 * The Class TokenMovement.
 * @author Ruxandra, Marius
 */
public class TokenMovement {
	
	/**
	 * @param token
	 * @param place
	 * @param animation
	 */
	public TokenMovement(RuntimeToken token, String place, Object animation) {
		super();
		this.token = token;
		this.place = place;
		this.animation = animation;
	}

	public RuntimeToken getToken() {
		return token;
	}

	public void setToken(RuntimeToken token) {
		this.token = token;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Object getAnimation() {
		return animation;
	}

	public void setAnimation(Object animation) {
		this.animation = animation;
	}

	/** The token. */
	private RuntimeToken token;
	
	/** The place. */
	private String place;
	
	private Object animation;
	

}
