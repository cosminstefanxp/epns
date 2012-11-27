package se2.e.utilities.test;

import static org.junit.Assert.*;
import static java.lang.Math.*;

import org.junit.Test;

import se2.e.utilities.Vector;


public class VectorTest {

	@Test
	public void testCreateCartesian() {
		double x = 3.4;
		double y = -2.0;
		Vector v = Vector.cartesian(x, y);
		assertEquals(x, v.getX(), 1e-5);
		assertEquals(y, v.getY(), 1e-5);
		}

	@Test
	public void testCreatePolar30() {
		double angle = 30.0*PI/180.0;
		double length = 10;
		Vector v = Vector.polar(angle, length);
		assertEquals(5.0, v.getY(), 1e-5);
		}

	@Test
	public void testCreatePolar60() {
		double angle = 60.0*PI/180.0;
		double length = 10;
		Vector v = Vector.polar(angle, length);
		assertEquals(5.0, v.getX(), 1e-5);
		}
	
	@Test
	public void testUnity() {
		double x = 10.0;
		double y = 20.0;
		Vector v = Vector.cartesian(x, y).unity();
		assertEquals(1.0, v.getLength(), 1e-5);
		}
	
	@Test
	public void testLength() {
		double x = 10.0;
		double y = 20.0;
		Vector v = Vector.cartesian(x, y);
		double angle = v.getAngle();
		v.setLength(10.0);
		assertEquals(angle, v.getAngle(), 1e-5);
		}
	

	}
