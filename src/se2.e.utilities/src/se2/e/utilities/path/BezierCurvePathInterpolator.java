package se2.e.utilities.path;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import se2.e.utilities.BezierCurve;
import se2.e.utilities.PathInterpolator;
import se2.e.utilities.Vector2D;
import static se2.e.utilities.Vector2D.*;
import se2.e.utilities.Where;

/**
 * The Bezier curve path interpolator interpolates positions and orientations
 * along a {@link se2.e.utilities.BezierCurve}.
 * 
 * The Bezier curve path interpolator is a more efficient interpolator than the
 * {@link se2.e.utilities.path.BezierPathInterpolator}, but can be used in the same way.
 * 
 * This interpolator also supports extra points for the tangents of end points.
 * 
 * @author Anders Kalhauge
 *
 */
public class BezierCurvePathInterpolator implements PathInterpolator{
	private BezierCurve curve;
	
	/**
	 * Creates a new Bezier curve path interpolator, using a list of points.
	 * 
	 * The interpolator will create a Bezier curve from the points.
	 * 
	 * @param points the points
	 */
	public BezierCurvePathInterpolator(List<Vector2D> points) {
		curve = new BezierCurve(points);
		}
	
	/**
	 * Creates a new Bezier curve path interpolator, using an array of points.
	 * 
	 * The interpolator will create a Bezier curve from the points.
	 * 
	 * @param points the points
	 */
	public BezierCurvePathInterpolator(Vector2D... points) {
		this(Arrays.asList(points));
		}
	
	@Override
	public double getLength() {
		return curve.distance(0.0, 1.0);
		}

	@Override
	public Where findPosition(double distance) {
		return curve.position(distance);
		}

	@Override
	public Where start() {
		return curve.position(0.0);
		}

	/**
	 * Calculates five extra points to show the tangent of the end points in
	 * a geometry editor.
	 * 
	 * @param p1 first or last point on the curve
	 * @param p2 second or second last point on the curve
	 * @param list the list to add points to
	 */
	private void tangentPoints(Vector2D p1, Vector2D p2, List<Vector2D> list) {
		Vector2D p = Vector2D.clone(p1);
		Vector2D d = subtract(p2, p1);
		int dots = (int)d.getLength()/5;
		d.multiply(1.0/dots);
		for (int i = 0; i < dots; i++) {
			list.add(p);
			p = add(p, d);
			}
		}
	
	@Override
	public List<Vector2D> getIntermediatePoints() {
		List<Vector2D> points = new ArrayList<Vector2D>();
		int n = curve.getPoints().size();
		tangentPoints(curve.getPoints().get(1), curve.getPoints().get(0), points);
		Vector2D p = curve.value(0.0);
		points.add(p);
		double delta = 1.0/curve.distance(0.0, 1.0); // less than a pixel
		for (double t = delta; t < 1.0; t += delta) points.add(curve.value(t));
		tangentPoints(curve.getPoints().get(n - 1), curve.getPoints().get(n - 2), points);
		return points;
		}

	}
