package se2.e.utility;

import java.util.List;

import javax.vecmath.Point3f;

/**
 * The PosRotInterpolator used for computing interpolations for position and/or rotation.
 */
public abstract class PosRotInterpolator {

	/** The points. */
	private List<Point3f> points;

	/** The speed. */
	private float speed;

	/**
	 * Instantiates a new position-rotation-interpolator.
	 * 
	 * @param points the points
	 * @param speed the speed
	 */
	public PosRotInterpolator(List<Point3f> points, float speed) {
		super();
		this.points = points;
		this.speed = speed;
		// TODO: Add more parameters if needed.
	}

	/**
	 * Gets the next position.
	 * 
	 * @param currentPosition the current position
	 * @return the next position
	 * 
	 * TODO: Maybe instead of giving current position there are 2 more alternatives: - the interpolator keeps it own
	 * track of where it is (but actually there is no point in this) - instead of current position, an alpha value (0 to
	 * 1) is given, marking the progress (e.g. 0 - beginning, 0.5 half of the way)
	 */
	public abstract Point3f getNextPosition(Point3f currentPosition);

	/**
	 * Gets the position. Using an alpha value is required, as for drawing is better than giving a current position.
	 * Instead, we can just give the alphas with a gap between them as needed...
	 * 
	 * @param alpha the alpha
	 * @return the position
	 */
	public abstract Point3f getPosition(float alpha);

	/**
	 * Gets the next rotation.
	 * 
	 * @param currentPosition the current position
	 * @return the next rotation
	 * 
	 * TODO: same as above;
	 */
	public abstract double getNextRotation(Point3f currentPosition);

}
