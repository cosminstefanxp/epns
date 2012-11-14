package se2.e.utilities;

/**
 * 
 * @author anders
 *
 */
public class Where {
	private Vector position;
	private Vector orientation;
	
	public Where(double x, double y, double heading) {
		position = Vector.cartesian(x, y);
		orientation = Vector.polar(heading);
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
	
	public Vector getPosition() {
		return position;
		}
	
	public Vector getOrientation() {
		return orientation;
		}
	
	}
