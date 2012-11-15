package se2.e.utilities;

/**
 * 
 * @author anders
 *
 */
public class Where {
	private Vector2D position;
	private Vector2D orientation;
	
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
	
	public double getHeading() {
		return orientation.getAngle();
		}
	
	public Vector2D getPosition() {
		return position;
		}
	
	public Vector2D getOrientation() {
		return orientation;
		}
	
	}
