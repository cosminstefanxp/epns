package se2.e.utilities.path;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import se2.e.utilities.PathInterpolator;
import se2.e.utilities.Vector2D;
import static se2.e.utilities.Vector2D.*;
import static java.lang.Math.*;
import se2.e.utilities.Where;

public class BezierPathInterpolator implements PathInterpolator {
	private List<Vector2D> positions;
	private double length = 1.0;

	public BezierPathInterpolator(List<Vector2D> positions) {
		this.positions = positions;
		this.length = findBezierLength(positions);
		}
	
	public BezierPathInterpolator(Vector2D... positions) {
		this(Arrays.asList(positions));
		}
	
	@Override
	public double getLength() { return length; }

	private static Vector2D bezier(double t, List<Vector2D> positions) {
		if (positions == null || positions.size() == 0)
			throw new RuntimeException("Trying to find bezier point from nothing");
		int n = positions.size() - 1; // The order is one less than the number of points.
		Vector2D B = new Vector2D(positions.get(0)).multiply(bernstein(0, n, t));
		for (int i = 1; i <= n; i++) B.factorAdd(bernstein(i, n, t), positions.get(i));
		return B;
		}
	
	private static double findBezierLength(double t, Vector2D Bt, double s, Vector2D Bs, double l, List<Vector2D> positions) {
		double m = (t + s)/2.0;
		Vector2D Bm = bezier(m, positions);
		double l1 = subtract(Bm, Bt).getLength();
		double l2 = subtract(Bs, Bm).getLength();
		if (abs(l - l1 - l2) > 0.1) {
			l1 = findBezierLength(t, Bt, m, Bm, l1, positions);
			l2 = findBezierLength(m, Bm, s, Bs, l2, positions);
			}
		return l1 + l2;
		}
	
	private static double findBezierLength(double t, double s, List<Vector2D> positions) {
		Vector2D Bt = bezier(t, positions);
		Vector2D Bs = bezier(s, positions);
		double l = subtract(Bs, Bt).getLength();
		return findBezierLength(t, Bt, s, Bs, l, positions);
		}
	
	private static double findBezierLength(List<Vector2D> positions) {
		Vector2D Bt = positions.get(0);
		Vector2D Bs = positions.get(positions.size() - 1);
		double l = subtract(Bs, Bt).getLength();
		return findBezierLength(0.0, Bt, 1.0, Bs, l, positions);
		}
	
	@Override
	public Where findPosition(double distance) {
		Vector2D p1 = null;
		Vector2D p2 = positions.get(0);
		double delta = 0.5/length; // less than a pixel
		for (double t = delta; t <= 1.0; t += delta) {
			p1 = p2;
			p2 = bezier(t, positions);
			distance -= p1.distance(p2);
			if (distance <= 0.0) break;
			}
		return new Where(p1.getX(), p1.getY(), p2.subtract(p1).getAngle());
		}

	@Override
	public List<Vector2D> getIntermediatePoints() {
		List<Vector2D> points = new ArrayList<Vector2D>();
		Vector2D p = positions.get(0);
		points.add(p);
		double delta = 0.5/length; // less than a pixel
		for (double t = delta; t < 1.0; t += delta) points.add(bezier(t, positions));
		points.add(positions.get(positions.size() - 1));
		return points;
		}
	
	@Override
	public Where start() { return findPosition(0); }

	public static double power(double t, int p) {
		if (p == 0) return 1.0;
		if (p == 1) return t;
		return power(t*t, p/2)*power(t, p%2);
		}	
	
	public static long binomialCoefficient(int n, int k) {
		if (k == 0) return 1;
		if (n == 0) return 0;
		long b = 1;
		for (int i = 1; i <= k; i++) {
			b *= (n - k + i);
			b /= i;
			}
		return b;
		}
	
	public static double bernstein(int i, int n, double t) {
		return binomialCoefficient(n, i)*power(t, i)*power(1 - t, n - i);
		}



	}
