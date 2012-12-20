package se2.e.utilities;

import static java.lang.Math.*;

/**
 * Convenience class for representing vectors in the plane.
 * 
 * The vector supports both Cartesian and polar coordinates.
 * 
 * This class can be optimized on performance by saving the length and
 * angle properties as well.
 * 
 * @author Anders Kalhauge
 *
 */
public class Vector2D {
	private double x;
	private double y;
	
	
	/**
	 * Clones a 2D vector from another 2D vector.
	 * 
	 * @deprecated use 
	 * 
	 * @param template
	 */
	@Deprecated
	public Vector2D(Vector2D template) {
		this.x = template.x;
		this.y = template.y;
		}
	
	private Vector2D(double x, double y) {
		this.x = x;
		this.y = y;
		}
	
	/**
	 * Copies the values of a template vector into this vector.
	 * 
	 * @param template vector to copy from.
	 * @return this vector after copying the values.
	 */
	public Vector2D copy(Vector2D template) {
		this.x = template.x;
		this.y = template.y;
		return this;
		}
	
	/**
	 * Creates a new 2D vector from another 2D vector.
	 * 
	 * @param template The vector to clone.
	 * @return The new 2D vector.
	 */
	public static Vector2D clone(Vector2D template) {
		return new Vector2D(template.x, template.y);
		}
	
	/**
	 * Creates a new 2D vector from Cartesian coordinates.
	 * 
	 * @param x The x-coordinate.
	 * @param y The y-coordinate.
	 * @return The new 2D vector.
	 */
	public static Vector2D cartesian(double x, double y) {
		return new Vector2D(x, y);
		}
	
	/**
	 * Creates a new 2D vector from polar coordinates.
	 * 
	 * @param angle the angle of the vector in radians
	 * @param length the length of the vector
	 * @return The new 2D vector
	 */
	public static Vector2D polar(double angle, double length) {
		return new Vector2D(length*cos(angle), length*sin(angle));
		}
	
	/**
	 * Creates a new 2D unit vector with a give angle.
	 * 
	 * @param angle the angle of the new 2D vector
	 * @return the new 2D vector
	 */
	public static Vector2D polar(double angle) {
		return polar(angle, 1);
		}
	
	/**
	 * Creates a new 2D zero vector.
	 * 
	 * @return the new 2D vector
	 */
	public static Vector2D zero() {
		return new Vector2D(0, 0);
		}
	
	/**
	 * Create a new 2D vector as the sum of two other 2D vectors.
	 * 
	 * The two addend vectors (a and b) will not be altered.
	 * 
	 * @param a first addend vector
	 * @param b second addend vector
	 * @return sum vector of a and b
	 */
	public static Vector2D add(Vector2D a, Vector2D b) {
		return clone(a).add(b);
		}
	
	/**
	 * Create a new 2D vector as the difference between two other 2D vectors.
	 * 
	 * The minuend and subtrahend vectors (a and b) will not be altered.
	 * 
	 * @param a minuend vector
	 * @param b subtrahend vector
	 * @return difference vector of a and b
	 */
	public static Vector2D subtract(Vector2D a, Vector2D b) {
		return clone(a).subtract(b);
		}
	
	/**
	 * Adds another 2D vector to this vector.
	 * 
	 * The other vector will not be changed.
	 * 
	 * @param other vector to add
	 * @return this vector after addition
	 */
	public Vector2D add(Vector2D other) {
		this.x += other.x;
		this.y += other.y;
		return this;
		}
	
	/**
	 * Adds another 2D vector sized a factor.
	 * 
	 * This method is meant for vector polynomials.
	 * The addend vector will not be altered.
	 * 
	 * @param factor factor to multiply the addend vector with before addition
	 * @param addend vector to add
	 * @return this vector after the factorized add.
	 */
	public Vector2D factorAdd(double factor, Vector2D addend) {
		this.x += factor*addend.x;
		this.y += factor*addend.y;
		return this;
		}
	
	
	public Vector2D deltaAdd(double distance, Vector2D addend) {
		double length = getLength();
		this.x += distance*addend.x/length;
		this.y += distance*addend.y/length;
		return this;
		}
	
	/**
	 * Subtracts a 2D vector from this vector.
	 * 
	 * The subtrahend vector will not be changed.
	 * 
	 * @param subtrahend the subtrahend vector
	 * @return this vector after subtraction
	 */
	public Vector2D subtract(Vector2D subtrahend) {
		this.x -= subtrahend.x;
		this.y -= subtrahend.y;
		return this;
		}
	
	/**
	 * Multiplies the length of this vector with a factor.
	 * 
	 * @param factor the factor
	 * @return this vector after multiplication
	 */
	public Vector2D multiply(double factor) {
		this.x *= factor;
		this.y *= factor;
		return this;
		}
	
	/**
	 * Divides the length of this vector with a divisor.
	 * 
	 * @param divisor the divisor
	 * @return this vector after the devision
	 */
	public Vector2D divide(double divisor) {
		this.x /= divisor;
		this.y /= divisor;
		return this;
		}
	
	/**
	 * Creates the normal vector of this vector.
	 * 
	 * Finds the perpendicular vector. This vector will not be changed.
	 * 
	 * @return a new normal vector
	 */
	public Vector2D normal() {
		return polar(getAngle() - PI/2.0);
		}
	
	/**
	 * Creates the unit vector of this vector.
	 * 
	 * This vector will not be changed.
	 * 
	 * @return a new unit vector
	 */
	public Vector2D unity() {
		return polar(getAngle());
		}
	
	/**
	 * Gets the x-coordinate of this vector.
	 * 
	 * @return the x-coordinate.
	 */
	public double getX() { return x; }
	
	/**
	 * Sets the x-coordinate of this vector.
	 * 
	 * @param value the new x-coordinate
	 */
	public void setX(double value) { x = value; }
	
	/**
	 * Gets the y-coordinate of this vector.
	 * 
	 * @return the y-coordinate
	 */
	public double getY() { return y; }
	
	/**
	 * Sets the y-coordinate of this vector.
	 * 
	 * @param value the new y-coordinate
	 */
	public void setY(double value) { y = value; }
	
	/**
	 * Gets the x-part of a partial distance along the orientation of this vector.
	 * 
	 * @param distance the distance to move
	 * @return the x-part of the distance.
	 */
	public double deltaX(double distance) {
		double length = getLength();
		return distance*x/length;
		}
	
	/**
	 * Gets the y-part of a partial distance along the orientation of this vector.
	 * 
	 * @param distance the distance to move
	 * @return the y-part of the distance.
	 */
	public double deltaY(double distance) {
		double length = getLength();
		return distance*y/length;
		}
	
	/**
	 * Gets the polar coordinate angle of this vector.
	 * 
	 * @return the angle
	 */
	public double getAngle() {
		return atan2(y, x);
		}
	
	/**
	 * Sets the polar coordinate angle of this vector.
	 * @param angle
	 */
	public void setAngle(double angle) {
		double length = getLength();
		x = length*cos(angle);
		y = length*sin(angle);
		}
	
	/**
	 * Gets the polar coordinate length of this vector.
	 * @return
	 */
	public double getLength() {
		return sqrt(x*x + y*y);
		}
	
	/**
	 * Sets the polar coordinate length of this vector.
	 * 
	 * If the vector is the zero vector, with a length of zero,
	 * this operation will assume that the angle, which is undefined in
	 * that case will be zero. 
	 * 
	 * @param value the length
	 */
	public void setLength(double value) {
		double length = getLength();
		if (length == 0.0) x = value;
		else {
			x = value*x/length;
			y = value*y/length;
			}
		}
	
	/**
	 * Calculates whether this vector is longer than a given distance.
	 * 
	 * Use this method in stead of getLength() when possible,
	 * while it is more efficient.
	 * 
	 * @param distance the distance to compare with.
	 * @return whether the length of this vector is longer than the given distance.
	 */
	public boolean longerThan(double distance) {
		return x*x + y*y > distance*distance;
		}
	
	/**
	 * Calculates the distance between vectors.
	 * 
	 * The vectors are considered positions.
	 * None of the vectors are changed.
	 * 
	 * @param other the other vector
	 * @return the distance
	 */
	public double distance(Vector2D other) {
		double dx = x - other.x;
		double dy = y - other.y;
		return sqrt(dx*dx + dy*dy);
		}

	/**
	 * Gets the x coordinate as an integer.
	 * Convenience method for pixel canvas drawing.
	 * 
	 * @return x as an integer.
	 */
	public int x() { return (int)(round(x)); }
	
	/**
	 * Gets the x coordinate multiplied by a factor as an integer.
	 * Convenience method for pixel canvas drawing.
	 * The multiplication is done before the conversion.
	 * 
	 * @param factor the factor to multiply with
	 * @return x times factor as an integer
	 */
	public int x(double factor) { return (int)(round(factor*x)); }
	
	/**
	 * Gets the y coordinate as an integer.
	 * Convenience method for pixel canvas drawing.
	 * 
	 * @return y as an integer.
	 */
	public int y() { return (int)(round(y)); }

	/**
	 * Gets the y coordinate multiplied by a factor as an integer.
	 * Convenience method for pixel canvas drawing.
	 * The multiplication is done before the conversion.
	 * 
	 * @param factor the factor to multiply with
	 * @return y times factor as an integer
	 */
	public int y(double factor) { return (int)(round(factor*y)); }

	@Override
	public String toString() {
		return "("+x+"; "+y+")";
		}
	
	}

