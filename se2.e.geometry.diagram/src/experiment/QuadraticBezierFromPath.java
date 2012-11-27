package experiment;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;

import se2.e.utilities.Vector2D;
import se2.e.utilities.path.QuadraticBezierPathInterpolator;
import static java.lang.Math.*;

public class QuadraticBezierFromPath {

	public static PointList allPoints(PointList list) {
		PointList result = new PointList();
		if (list == null) return result;
		Vector2D[] positions = new Vector2D[list.size()];
		for (int i = 0; i < list.size(); i++) {
			Point p = list.getPoint(i);
			positions[i] = Vector2D.cartesian(p.x, p.y);
			}
		QuadraticBezierPathInterpolator bezier = 
				new QuadraticBezierPathInterpolator(positions);
		for (Vector2D point : bezier.getIntermediatePoints()) {
			result.addPoint((int)abs(point.getX()), (int)abs(point.getY()));
			}
		return result;
		}

	}
