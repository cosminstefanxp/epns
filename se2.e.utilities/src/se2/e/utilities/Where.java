package se2.e.utilities;
import static java.lang.Math.*;

/**
 * A position and an orientation.
 * 
 * The Where class uses two 2D vectors to hold information of an objects
 * position and orientation. Coordinates for the position can be found, as well as
 * heading and speed of the orientation.
 * 
 * Convenience methods for printing on a pixel canvas is also provided
 * 
 * @author Anders Kalhauge
 *
 */
public class Where {
	private Vector2D position;
	private Vector2D orientation;
	
	/**
	 * Create a new where, using two 2D vectors.
	 * 
	 * @param position the position.
	 * @param orientation the orientation.
	 */
	public Where(Vector2D position, Vector2D orientation) {
		this.position = position;
		this.orientation = orientation;
		}
	
	/**
	 * Create a new where from its <code>x</code> and <code>y</code> coordinates
	 * and its heading.
	 * 
	 * Speed will be set to 1.
	 * 
	 * @param x the <code>x</code> coordinate.
	 * @param y the <code>y</code> coordinate.
	 * @param heading the angle of the orientation in radians.
	 */
	public Where(double x, double y, double heading) {
		position = Vector2D.cartesian(x, y);
		orientation = Vector2D.polar(heading);
		}
	
	/**
	 * Get the 2D vector position.
	 * 
	 * @return the position.
	 */
	public Vector2D getPosition() {
		return position;
		}
	
	/**
	 * Get the 2D vector orientation.
	 * 
	 * @return the orientation.
	 */
	public Vector2D getOrientation() {
		return orientation;
		}
	
	/**
	 * Get the <code>x</code> coordinate of the position.
	 * 
	 * @return the <code>x</code> coordinate.
	 */
	public double getX() {
		return position.getX();
		}
	
	/**
	 * Get the <code>y</code> coordinate of the position.
	 * 
	 * @return the <code>y</code> coordinate.
	 */
	public double getY() {
		return position.getY();
		}
	
	/**
	 * Get the heading.
	 * 
	 * The heading is the angle of the orientation vector.
	 * 
	 * @return the heading.
	 */
	public double getHeading() {
		return orientation.getAngle();
		}
	
	/**
	 * Get the speed.
	 * 
	 * The speed is the length of the orientation vector.
	 * 
	 * @return the speed.
	 */
	public double getSpeed() {
		return orientation.getLength();
		}
	
	/**
	 * Convenience method for printing on pixel canvas;
	 * 
	 * @return Starting x;
	 */
	public int getStartX() { return position.x(); }
	
	/**
	 * Convenience method for printing on pixel canvas;
	 * 
	 * @return Starting x;
	 */
	public int getStartY() { return position.y(); }
	
	/**
	 * Convenience method for printing on pixel canvas;
	 * 
	 * @return Ending x;
	 */
	public int getEndX(double factor) { return position.x() + orientation.x(factor); }
	
	/**
	 * Convenience method for printing on pixel canvas;
	 * 
	 * @return Ending y;
	 */
	public int getEndY(double factor) { return position.y() + orientation.y(factor); }
		
	@Override
	public String toString() {
		return "At "+position+", heading "+180*orientation.getAngle()/PI+" deg";
		}
	
	}
