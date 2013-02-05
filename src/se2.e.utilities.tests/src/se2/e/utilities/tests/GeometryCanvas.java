package se2.e.utilities.tests;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import se2.e.utilities.PathInterpolator;
import se2.e.utilities.Vector2D;
import se2.e.utilities.Where;
import se2.e.utilities.path.BezierCurvePathInterpolator;
import se2.e.utilities.path.BezierPathInterpolator;
import se2.e.utilities.path.LinearPathInterpolator;
import se2.e.utilities.path.QuadraticBezierPathInterpolator;

/**
 * Canvas class for visualizing the path iterators
 * 
 * @author Anders Kalhauge
 *
 */
public class GeometryCanvas extends Canvas implements MouseListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;

	private Point whereMouseIs = null;
	private List<Vector2D> positions = new ArrayList<Vector2D>();
	private PathInterpolator interpolator = null;
	
	public GeometryCanvas() {
		addMouseListener(this);
		addMouseMotionListener(this);
		}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D graphics = (Graphics2D)g;
//		graphics.setColor(Color.BLUE);
//		//graphics.drawRect(10, 10, 100, 80);
//		if (whereMouseIs != null) {
//			graphics.drawLine(whereMouseIs.x, whereMouseIs.y - 3, whereMouseIs.x, whereMouseIs.y + 3);
//			graphics.drawLine(whereMouseIs.x - 3, whereMouseIs.y, whereMouseIs.x + 3, whereMouseIs.y);
//			}
//		graphics.setColor(Color.CYAN);
//		for (int i = 1; i < positions.size(); i++) { 
//			Vector2D p0 = positions.get(i - 1);
//			Vector2D p1 = positions.get(i);
//			graphics.drawLine(p0.x(), p0.y(), p1.x(), p1.y());
//			}
		graphics.setColor(Color.BLUE);
		for (Vector2D position : positions) graphics.drawRect(position.x() - 1, position.y() - 1, 2, 2); 
		if (interpolator != null) {
			for (double distance = 0.0; distance < interpolator.getLength(); distance += 10.0) {
				Where where = interpolator.findPosition(distance);
				graphics.setColor(Color.LIGHT_GRAY);
				graphics.drawLine(where.getStartX(), where.getStartY(), where.getEndX(30.0), where.getEndY(30.0));
				graphics.setColor(Color.DARK_GRAY);
				graphics.drawArc(where.getStartX() - 1, where.getStartY() - 1, 2, 2, 0, 360);
				}
			graphics.setColor(Color.RED);
//			int x = 0;
//			int y = 0;
			for (Vector2D point : interpolator.getIntermediatePoints()) {
				graphics.drawRect(point.x(), point.y(), 0, 0);
//				if (x != 0 || y != 0) {
//					graphics.drawLine(x, y, point.x(), point.y());
//					}
//				x = point.x();
//				y = point.y();
				}
			}
		}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		whereMouseIs = e.getPoint();
		//repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Vector2D position = Vector2D.cartesian(e.getX(), e.getY());
		positions.add(position);
		// if (positions.size() > 1) interpolator = new LinearPathInterpolator(positions);
		// if (positions.size() > 1) interpolator = new QuadraticBezierPathInterpolator(positions);
		// if (positions.size() > 1) interpolator = new BezierPathInterpolator(positions);
		if (positions.size() > 1) interpolator = new BezierCurvePathInterpolator(positions);
		repaint();
		}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	}
