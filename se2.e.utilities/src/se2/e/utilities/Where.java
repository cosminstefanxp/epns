package se2.e.utilities;
import static java.lang.Math.*;

/**
 * 
 * @author anders
 *
 */
public class Where {
	private Vector2D position;
	private Vector2D orientation;
	
	public Where(Vector2D position, Vector2D orientation) {
		this.position = position;
		this.orientation = orientation;
		}
	
	public Where(double x, double y, double heading) {
		position = Vector2D.cartesian(x, y);
		orientation = Vector2D.polar(heading);
		}
	
	public double getX() {
		return position.getX();
		}
	
	public double getY() {
		return position.getY();
		}
	
	/**
	 * Conveinience method for printing on pixel canvas;
	 * 
	 * @return Starting x;
	 */
	public int getStartX() { return position.x(); }
	
	/**
	 * Conveinience method for printing on pixel canvas;
	 * 
	 * @return Starting x;
	 */
	public int getStartY() { return position.y(); }
	
	/**
	 * Conveinience method for printing on pixel canvas;
	 * 
	 * @return Ending x;
	 */
	public int getEndX(double factor) { return position.x() + orientation.x(factor); }
	
	/**
	 * Conveinience method for printing on pixel canvas;
	 * 
	 * @return Ending y;
	 */
	public int getEndY(double factor) { return position.y() + orientation.y(factor); }
		
	public double getHeading() {
		return orientation.getAngle();
		}
	
	public Vector2D getPosition() {
		return position;
		}
	
	public Vector2D getOrientation() {
		return orientation;
		}

	@Override
	public String toString() {
		return "At "+position+", heading "+180*orientation.getAngle()/PI+" deg";
		}
	
	}
