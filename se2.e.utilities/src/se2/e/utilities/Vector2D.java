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
public class Vector {
	private double x;
	private double y;
	
	public Vector(Vector template) {
		this.x = template.x;
		this.y = template.y;
		}
	
	private Vector(double x, double y) {
		this.x = x;
		this.y = y;
		}
	
	public static Vector cartesian(double x, double y) {
		return new Vector(x, y);
		}
	
	public static Vector polar(double angle, double length) {
		return new Vector(length*cos(angle), length*sin(angle));
		}
	
	public static Vector polar(double angle) {
		return polar(angle, 1.0);
		}
	
	public static Vector add(Vector a, Vector b) {
		Vector result = new Vector(a);
		result.add(b);
		return result;
		}
	
	public static Vector subtract(Vector a, Vector b) {
		Vector result = new Vector(a);
		result.subtract(b);
		return result;
		}
	
	public void add(Vector other) {
		this.x += other.x;
		this.y += other.y;
		}
	
	public void subtract(Vector other) {
		this.x -= other.x;
		this.y -= other.y;
		}
	
	public Vector normal() {
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
	
	}
