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
	
	public static Vector2D cartesian(double x, double y) {
		return new Vector2D(x, y);
		}
	
	public static Vector2D polar(double angle, double length) {
		return new Vector2D(length*cos(angle), length*sin(angle));
		}
	
	public static Vector2D polar(double angle) {
		return polar(angle, 1.0);
		}
	
	public static Vector2D add(Vector2D a, Vector2D b) {
		Vector2D result = new Vector2D(a);
		result.add(b);
		return result;
		}
	
	public static Vector2D subtract(Vector2D a, Vector2D b) {
		Vector2D result = new Vector2D(a);
		result.subtract(b);
		return result;
		}
	
	public void add(Vector2D other) {
		this.x += other.x;
		this.y += other.y;
		}
	
	public void subtract(Vector2D other) {
		this.x -= other.x;
		this.y -= other.y;
		}
	
	public Vector2D normal() {
		return polar(getAngle());
		}
	
	public double getX() { return x; }
	
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

	@Override
	public String toString() {
		return "Vector2D [x=" + x + ", y=" + y + "]";
	}
	
	}
