package experiment;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;

import se2.e.utilities.PathInterpolator;
import se2.e.utilities.Vector2D;
import se2.e.utilities.path.BezierPathInterpolator;
import se2.e.utilities.path.QuadraticBezierPathInterpolator;

public class QuadraticBezierFromPath {

	public static PointList allPoints(PointList list) {
		PointList result = new PointList();
		if (list == null) return result;
		List<Vector2D> positions = new ArrayList<Vector2D>();
		for (int i = 0; i < list.size(); i++) {
			Point p = list.getPoint(i);
			positions.add(Vector2D.cartesian(p.x, p.y));
			}
		PathInterpolator bezier = 
//				new QuadraticBezierPathInterpolator(positions);
				new BezierPathInterpolator(positions);
		for (Vector2D point : bezier.getIntermediatePoints()) {
			result.addPoint(point.x(), point.y());
			}
		return result;
		}

	}
