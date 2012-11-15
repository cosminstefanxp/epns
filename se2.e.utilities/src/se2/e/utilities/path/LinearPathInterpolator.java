package se2.e.utilities.path;

import java.util.ArrayList;
import java.util.List;

import se2.e.utilities.PathInterpolator;
import se2.e.utilities.Vector2D;
import se2.e.utilities.Where;

/**
 * A very simple implementation of an interpolatable path.
 * 
 * @author anders
 *
 */
public class LinearPathInterpolator implements PathInterpolator {
	private List<Step> steps = new ArrayList<Step>();
	private Step last;
	private double length = 0.0;
	
	/**
	 * 
	 * @param start
	 * @param positions
	 */
	public LinearPathInterpolator(Vector2D start, Vector2D... positions) {
		Vector2D actual = start;
		for (Vector2D next : positions) {
			last = new Step(length, actual, next);
			steps.add(last);
			length += last.getLength();
			}
		}
	
	@Override
	public double getLength() { return length; }

	@Override
	public Where start() {
		return findPosition(0, null);
		}
	
	@Override
	public Where findPosition(double distance, Where position) {
		for (Step step : steps) {
			if (!step.isWithin(distance)) continue;
			return step.findPosition(distance, position);
			}
		return last.findPosition(0, position);
		}
	
//	@Override
//	public void movePosition(double delta, Where position) {
//		}
//	
	private class Step {
		private double basis;
		private Vector2D start;
		private Vector2D next;
		
		public Step(double basis, Vector2D start, Vector2D end) {
			this.basis = basis;
			this.start = start;
			this.next = Vector2D.subtract(end, start);
			}
		
		public boolean isWithin(double distance) {
			if (distance < this.basis) return false;
			if (next.longerThan(distance - this.basis)) return true;
			return false;
			}
		
		public Where findPosition(double distance, Where position) {
			double partial = distance - basis;
			if (position == null) position = new Where(0, 0, 0);
			position.getPosition().setX(start.getX() + next.deltaX(partial));
			position.getPosition().setY(start.getY() + next.deltaX(partial));
			position.getOrientation().setAngle(next.getAngle());
			return position;
			}
		
		public double getLength() { return next.getLength(); }
		}

	}
