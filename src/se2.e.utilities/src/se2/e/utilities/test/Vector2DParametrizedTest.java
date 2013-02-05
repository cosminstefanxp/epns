package se2.e.utilities.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import se2.e.utilities.Vector2D;

/**
 * Class for testing various add, subtract, multiply, and divide methods on the <code>Vector2D</code> class
 * 
 * @author Anders Kalhauge
 *
 */
@RunWith(Parameterized.class)
public class Vector2DParametrizedTest {
	private static final double DELTA = 0.00001;
	private double x, y;
	private double f;
	private double dx, dy;
	private double rx, ry;
	
	private static void addData(double x, double y, double f, double dx, double dy, Collection<Object[]> data) {
		data.add(new Object[] { x, y, f, dx, dy });
		}	
	
	private static void makeData(double x, double y, double f, Collection<Object[]> data) {
		addData(x, y, f, 0, 0, data);
		addData(x, y, f, 1, 0, data);
		addData(x, y, f, 0.5, 0.5, data);
		addData(x, y, f, 0, 1, data);
		addData(x, y, f, -0.5, 0.5, data);
		addData(x, y, f, -1, 0, data);
		addData(x, y, f, -0.5, -0.5, data);
		addData(x, y, f, 0, -1, data);
		addData(x, y, f, 0.5, -0.5, data);
		addData(x, y, f, Double.MIN_NORMAL, Double.MIN_NORMAL, data);
		}
	
	private static void makeData(double x, double y, Collection<Object[]> data) {
		makeData(x, y, -2.1, data);
		makeData(x, y, 0, data);
		makeData(x, y, 3.2, data);
		}
	
	@Parameters
	public static Collection<Object[]> data() {
		Collection<Object[]> data = new ArrayList<Object[]>();
		makeData(0, 0, data);
		makeData(1, 0, data);
		makeData(0.5, 0.5, data);
		makeData(0, 1, data);
		makeData(-0.5, 0.5, data);
		makeData(-1, 0, data);
		makeData(-0.5, -0.5, data);
		makeData(0, -1, data);
		makeData(0.5, -0.5, data);
		makeData(Double.MIN_NORMAL, Double.MIN_NORMAL, data);
		return data;
		}
	
	public Vector2DParametrizedTest(double x, double  y, double f, double dx, double dy) {
		this.x = x;
		this.y = y;
		this.f = f;
		this.dx = dx;
		this.dy = dy;
		this.rx = x + dx;
		this.ry = y + dy;
		}
	
	@Test
	public void testAddStatic() {
		Vector2D o = Vector2D.cartesian(x, y);
		Vector2D d = Vector2D.cartesian(dx, dy);
		Vector2D r = Vector2D.add(o, d);
		// Check result
		assertEquals(rx, r.getX(), DELTA);
		assertEquals(ry, r.getY(), DELTA);
		// Check o is unchanged
		assertEquals(x, o.getX(), DELTA);
		assertEquals(y, o.getY(), DELTA);
		// Check d is unchanged
		assertEquals(dx, d.getX(), DELTA);
		assertEquals(dy, d.getY(), DELTA);
		}
	
	@Test
	public void testAddInstance() {
		Vector2D o = Vector2D.cartesian(x, y);
		Vector2D d = Vector2D.cartesian(dx, dy);
		Vector2D r = o.add(d);
		// Check result
		assertEquals(rx, r.getX(), DELTA);
		assertEquals(ry, r.getY(), DELTA);
		// Check o is changed
		assertEquals(rx, o.getX(), DELTA);
		assertEquals(ry, o.getY(), DELTA);
		// Check d is unchanged
		assertEquals(dx, d.getX(), DELTA);
		assertEquals(dy, d.getY(), DELTA);
		}

	@Test
	public void testSubtractStatic() {
		Vector2D o = Vector2D.cartesian(x, y);
		Vector2D d = Vector2D.cartesian(-dx, -dy);
		Vector2D r = Vector2D.subtract(o, d);
		// Check result
		assertEquals(rx, r.getX(), DELTA);
		assertEquals(ry, r.getY(), DELTA);
		// Check o is unchanged
		assertEquals(x, o.getX(), DELTA);
		assertEquals(y, o.getY(), DELTA);
		// Check d is unchanged
		assertEquals(-dx, d.getX(), DELTA);
		assertEquals(-dy, d.getY(), DELTA);
		}
	
	@Test
	public void testSubtractInstance() {
		Vector2D o = Vector2D.cartesian(x, y);
		Vector2D d = Vector2D.cartesian(-dx, -dy);
		Vector2D r = o.subtract(d);
		// Check result
		assertEquals(rx, r.getX(), DELTA);
		assertEquals(ry, r.getY(), DELTA);
		// Check o is changed
		assertEquals(rx, o.getX(), DELTA);
		assertEquals(ry, o.getY(), DELTA);
		// Check d is unchanged
		assertEquals(-dx, d.getX(), DELTA);
		assertEquals(-dy, d.getY(), DELTA);
		}

	@Test
	public void testMultiplyInstance() {
		Vector2D o = Vector2D.cartesian(x, y);
		Vector2D r = o.multiply(f);
		assertEquals(f*x, r.getX(), DELTA);
		assertEquals(f*y, r.getY(), DELTA);
		assertSame(o, r);
		}
	
	@Test
	public void testDivideInstance() {
		Assume.assumeTrue(f != 0);
		Vector2D o = Vector2D.cartesian(x, y);
		Vector2D r = o.divide(f);
		assertEquals(x/f, r.getX(), DELTA);
		assertEquals(y/f, r.getY(), DELTA);
		assertSame(o, r);
		}
	
	@Test
	public void testFactorAddInstance() {
		Vector2D o = Vector2D.cartesian(x, y);
		Vector2D d = Vector2D.cartesian(dx, dy);
		Vector2D r = o.factorAdd(f, d);
		assertEquals(x + f*dx, r.getX(), DELTA);
		assertEquals(y + f*dy, r.getY(), DELTA);
		assertSame(o, r);
		assertEquals(dx, d.getX(), DELTA);
		assertEquals(dy, d.getY(), DELTA);
		}
	
	@Test
	public void testDeltaAddInstance() {
		Vector2D o = Vector2D.cartesian(x, y);
		double l = o.getLength();
		Assume.assumeTrue(o.getLength() != 0.0);
		Vector2D d = Vector2D.cartesian(dx, dy);
		Vector2D r = o.deltaAdd(f, d);
		assertEquals(x + f*dx/l, r.getX(), DELTA);
		assertEquals(y + f*dy/l, r.getY(), DELTA);
		assertSame(o, r);
		assertEquals(dx, d.getX(), DELTA);
		assertEquals(dy, d.getY(), DELTA);
		}
	
	
	}
