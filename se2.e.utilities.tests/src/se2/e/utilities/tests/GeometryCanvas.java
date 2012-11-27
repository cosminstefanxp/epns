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
import se2.e.utilities.path.LinearPathInterpolator;
import se2.e.utilities.path.QuadraticBezierPathInterpolator;

public class GeometryCanvas extends Canvas implements MouseListener, MouseMotionListener {
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
		graphics.setColor(Color.BLUE);
		//graphics.drawRect(10, 10, 100, 80);
		if (whereMouseIs != null) {
			graphics.drawLine(whereMouseIs.x, whereMouseIs.y - 3, whereMouseIs.x, whereMouseIs.y + 3);
			graphics.drawLine(whereMouseIs.x - 3, whereMouseIs.y, whereMouseIs.x + 3, whereMouseIs.y);
			}
		graphics.setColor(Color.BLACK);
		for (Vector2D position : positions) graphics.drawRect((int)position.getX() - 1, (int)position.getY() - 1, 2, 2); 
		if (interpolator != null) {
			graphics.setColor(Color.RED);
			for (double distance = 0.0; distance < interpolator.getLength(); distance += 4.0) {
				Where where = interpolator.findPosition(distance);
				graphics.drawArc((int)where.getX() - 1, (int)where.getY() - 1, 2, 2, 0, 360);
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
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Vector2D position = Vector2D.cartesian(e.getX(), e.getY());
		positions.add(position);
		// if (positions.size() >= 2) interpolator = new LinearPathInterpolator(positions);
		if (positions.size() >= 2) interpolator = new QuadraticBezierPathInterpolator(positions);
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
