package se2.e.utilities;

import static java.lang.Math.*;

/**
 * Convienience class for representing vectors in the plane.
 * 
 * The vector supports both cartesian and polar coordinates.
 * 
 * This class can be optimized on performance by saving the length and
 * angle properties as well.
 * 
 * @author anders
 *
 */
public class Vector2D {
	private double x;
	private double y;
	
	public Vector2D(Vector2D template) {
		this.x = template.x;
		this.y = template.y;
		}
	
	private Vector2D(double x, double y) {
		this.x = x;
		this.y = y;
		}
	
	/**
	 * Copy the values of a template vector into this vector.
	 * 
	 * @param template vector to copy from.
	 * @return this vector after copying the values.
	 */
	public Vector2D copy(Vector2D template) {
		this.x = template.x;
		this.y = template.y;
		return this;
		}
	
	public static Vector2D cartesian(double x, double y) {
		return new Vector2D(x, y);
		}
	
	public static Vector2D polar(double angle, double length) {
		return new Vector2D(length*cos(angle), length*sin(angle));
		}
	
	public static Vector2D polar(double angle) {
		return polar(angle, 1.0);
		}
	
	/**
	 * Create a new 2D vector as the sum of two other 2D vectors.
	 * 
	 * The two addend vectors (a and b) will not be altered.
	 * 
	 * @param a first addend vector.
	 * @param b second addend vector.
	 * @return sum vector of a and b.
	 */
	public static Vector2D add(Vector2D a, Vector2D b) {
		Vector2D result = new Vector2D(a);
		result.add(b);
		return result;
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
		return new Vector2D(a).subtract(b);
		}
	
	/**
	 * Add another 2D vector to this vector.
	 * 
	 * The other vector will not be changed.
	 * 
	 * @param other vector to add.
	 * @return this vector after addition.
	 */
	public Vector2D add(Vector2D other) {
		this.x += other.x;
		this.y += other.y;
		return this;
		}
	
	/**
	 * Add another 2D vector sized a factor.
	 * 
	 * This method is ment for vector polynominals.
	 * The addend vector will not be altered.
	 * 
	 * @param factor factor to multiply the addend vector with befor addition.
	 * @param addend vector to add.
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
	
	public Vector2D subtract(Vector2D other) {
		this.x -= other.x;
		this.y -= other.y;
		return this;
		}
	
	public Vector2D multiply(double factor) {
		this.x *= factor;
		this.y *= factor;
		return this;
		}
	
	public Vector2D divide(double divisor) {
		this.x /= divisor;
		this.y /= divisor;
		return this;
		}
	
	public Vector2D normal() {
		return polar(getAngle() - PI/2.0);
		}
	
	public Vector2D unity() {
		return polar(getAngle());
		}
	
	public double getX() { return x; }
	
	/**
	 * Conveinience method for pixel canvas drawing.
	 * 
	 * @return x as an integer.
	 */
	public int x() { return (int)(round(x)); }
	public int x(double factor) { return (int)(round(factor*x)); }
	
	/**
	 * Conveinience method for pixel canvas drawing.
	 * 
	 * @return y as an integer.
	 */
	public int y() { return (int)(round(y)); }
	public int y(double factor) { return (int)(round(factor*y)); }
	
	public double deltaX(double distance) {
		double length = getLength();
		return distance*x/length;
		}
	
	public double deltaY(double distance) {
		double length = getLength();
		return distance*y/length;
		}
	
	public void setX(double value) { x = value; }
	
	public double getY() { return y; }
	
	public void setY(double value) { y = value; }
	
	public double getAngle() {
		return atan2(y, x);
		}
	
	public void setAngle(double angle) {
		double length = getLength();
		x = length*cos(angle);
		y = length*sin(angle);
		}
	
	public double getLength() {
		return sqrt(x*x + y*y);
		}
	
	public void setLength(double value) {
		double length = getLength();
		x = value*x/length;
		y = value*y/length;
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
	
	public double distance(Vector2D other) {
		double dx = x - other.x;
		double dy = y - other.y;
		return sqrt(dx*dx + dy*dy);
		}

	@Override
	public String toString() {
		return "("+x+"; "+y+")";
		}
	
	}
