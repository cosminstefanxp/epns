package se2.e.utilities.test;

import se2.e.utilities.path.BezierPathInterpolator;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int n = 0; n < 40; n++) {
			String text = String.format("%2d) ", n);
			for (int k = 0; k <= n; k++) {
				try {
					long b = BezierPathInterpolator.binomialCoefficient(n, k);
					text += String.format("%4d ", b);
					}
				catch (RuntimeException re) {
					text += re.getMessage();
					}
				}
			System.out.println(text);
			}

		}

}
