package se2.e.utilities;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;
import static se2.e.utilities.ToolBox.*;
import static se2.e.utilities.Vector2D.subtract;

public class BezierCurve {
	private List<Vector2D> points;
	
	public BezierCurve() {
		points = new ArrayList<Vector2D>();
		}

	public BezierCurve(List<Vector2D> points) {
		this.points = points;
		}
	
	public void add(Vector2D point) {
		points.add(point);
		}
	
	/**
	 * Get the underlying points of the Bezier curve.
	 * 
	 * @return The underlying points.
	 */
	public List<Vector2D> getPoints() { return points; }
	
	/**
	 * Find the value of the Bezier function for a given <code>t</code>.
	 * 
	 * <code>t</code> is a real number between zero and one.
	 * 
	 * @param t
	 * @return
	 */
	public Vector2D value(double t) {
		assert 0.0 <= t && t <= 1.0: "BezierCurve.valueOf is only defined for t between zero and one, t was "+t; 
		if (points == null || points.size() == 0)
			throw new RuntimeException("Trying to find bezier point from nothing");
		int n = points.size() - 1; // The order is one less than the number of points.
		//Vector2D B = new Vector2D(points.get(0)).multiply(bernsteinBasisPolynomial(0, n, t));
		Vector2D B = Vector2D.zero();
		for (int i = 0; i <= n; i++) B.factorAdd(bernsteinBasisPolynomial(i, n, t), points.get(i));
		return B;
		}

	private double distance(double t, Vector2D Bt, double s, Vector2D Bs, double l) {
		double m = (t + s)/2.0;
		Vector2D Bm = value(m);
		double l1 = Bm.distance(Bt);
		double l2 = Bs.distance(Bm);
		if (abs(l - l1 - l2) > 0.1) { // TODO: consider this
			l1 = distance(t, Bt, m, Bm, l1);
			l2 = distance(m, Bm, s, Bs, l2);
			}
		return l1 + l2;
		}
	
	public double distance(double t, double s) {
		Vector2D Bt = value(t);
		Vector2D Bs = value(s);
		double l = subtract(Bs, Bt).getLength();
		return distance(t, Bt, s, Bs, l);
		}
	
	public Where position(double distance) {
		Vector2D p1 = null;
		Vector2D p2 = points.get(0);
		double delta = 0.5/distance(0, 1); // less than a pixel
		for (double t = delta; t <= 1.0; t += delta) {
			p1 = p2;
			p2 = value(t);
			distance -= p1.distance(p2);
			if (distance <= 0.0) break;
			}
		return new Where(p1.getX(), p1.getY(), p2.subtract(p1).getAngle());
		}
	
	}
