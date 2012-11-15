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
	private double length = 0.0;
	
	/**
	 * 
	 * @param originPoint
	 * @param positions
	 */
	public LinearPathInterpolator(Vector2D... positions) {
		assert(positions!=null && positions.length>=2);
		Step last;
		for(int i=0;i<positions.length-1;i++)
		{
			last=new Step(length, positions[i], positions[i+1]);
			steps.add(last);
			length += last.getLength();
		}
		System.out.println("Steps: "+steps);
		}
	
	@Override
	public double getLength() { return length; }

	@Override
	public Where start() {
		return findPosition(0);
		}
	
	@Override
	public Where findPosition(double distance) {
		for (Step step : steps) {
			if (!step.isWithin(distance)) continue;
			System.out.println("Using step: "+step);
			return step.findPosition(distance);
			}
		return steps.get(steps.size()-1).findPosition(length);
		}
	
//	@Override
//	public void movePosition(double delta, Where position) {
//		}
//	
	private class Step {
		private double baseDistance;
		private Vector2D originPoint;
		private Vector2D next;
		
		public Step(double baseDistance, Vector2D originPoint, Vector2D endPoint) {
			this.baseDistance = baseDistance;
			this.originPoint = originPoint;
			this.next = Vector2D.subtract(endPoint, originPoint);
			}
		
		public boolean isWithin(double distance) {
			if (distance < this.baseDistance) return false;
			if (next.longerThan(distance - this.baseDistance)) return true;
			return false;
			}
		
		public Where findPosition(double distance) {
			double partial = distance - baseDistance;
			Where position = new Where(0, 0, 0);
			position.getPosition().setX(originPoint.getX() + next.deltaX(partial));
			position.getPosition().setY(originPoint.getY() + next.deltaY(partial));
			position.getOrientation().setAngle(next.getAngle());
			return position;
			}
		
		public double getLength() { return next.getLength(); }

		@Override
		public String toString() {
			return "Step [baseDistance=" + baseDistance + ", originPoint=" + originPoint + ", next=" + next + "]";
		}
		}

	}
