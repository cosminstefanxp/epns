package se2.e.utilities.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import se2.e.utilities.ToolBox;

@RunWith(Parameterized.class)
public class BinominalCoefficientTest {
	private int n, k;
	private long C;

	private static void makeData(int n, int k, long C, Collection<Object[]> data) {
		// Data was defined as one based, which is wrong, but this soultion was faster.
		n--;
		k--;
		if (C == -1) {
			if (k == n || k == 0) C = 1;
			else C = ToolBox.binomialCoefficient(n - 1, k) + ToolBox.binomialCoefficient(n - 1, k - 1);
			}
		data.add(new Object[] {n, k, C});
		}
	
	@Parameters
	public static Collection<Object[]> data() {
		Collection<Object[]> data = new ArrayList<Object[]>();
//		makeData(0, 0, 1, data);
//		makeData(0, 1, 0, data);
		makeData(1, 1, 1, data);
		makeData(2, 1, 1, data);
		makeData(2, 2, 1, data);
		makeData(3, 1, 1, data);
		makeData(3, 2, 2, data);
		makeData(3, 3, 1, data);
		makeData(4, 1, 1, data);
		makeData(4, 2, 3, data);
		makeData(4, 3, 3, data);
		makeData(4, 4, 1, data);
		makeData(5, 1, 1, data);
		makeData(5, 2, 4, data);
		makeData(5, 3, 6, data);
		makeData(5, 4, 4, data);
		makeData(5, 5, 1, data);
		makeData(6, 1, 1, data);
		makeData(6, 2, 5, data);
		makeData(6, 3, 10, data);
		makeData(6, 4, 10, data);
		makeData(6, 5, 5, data);
		makeData(6, 1, 1, data);
		for (int n = 7; n < 40; n++) {
			for (int k = 1; k <= n; k++) {
				makeData(n, k, -1, data);
			}
		}
		return data;
		}
	
	public BinominalCoefficientTest(int n, int k, long C) {
		this.n = n;
		this.k = k;
		this.C = C;
		}
	
	@Test
	public void testBinominalCoefficient() {
		long r = -1;
		try {
			r = ToolBox.binomialCoefficient(n, k);
			}
		finally {
			System.out.println(""+r+" = C("+n+";"+k+")");
			}
		assertEquals(C, r);
		}

	}
