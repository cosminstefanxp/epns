package se2.e.utilities;

/**
 * The tool box class contains various implementations of mathematical functions
 * used in the utilities package.
 * 
 * @author Anders Kalhauge
 *
 */
public class ToolBox {

	/**
	 * The tool box class should not be instantiated.
	 */
	private ToolBox() {	}
	
	/**
	 * Raise a real number to a positive integer exponent.
	 * 
	 * This method uses a divide and conquer approach
	 * 
	 * @param base The real base.
	 * @param exponent The integer exponent.
	 * @return the power of <code>base</code> raised to the power of <code>exponent</code>.
	 */
	public static double power(double base, int exponent) {
		if (exponent < 0) throw new IllegalArgumentException("Not defined for negative exponents");
		if (exponent == 0) return 1.0;
		if (exponent == 1) return base;
		return power(base*base, exponent/2)*power(base, exponent%2);
		}	
	
	/**
	 * Calculates the binomial coefficient of two numbers.
	 * 
	 * Works with n and k up to at least 40.
	 * 
	 * @param n n.
	 * @param k k.
	 * @return the binomial coefficient of n over k.
	 * @throws IllegalArgumentException when <code>n</code> or <code>k</code> are negative,
	 *         or <code>k</code> is greater than <code>n</code>. 
	 */
	public static long binomialCoefficient(int n, int k) {
		if (k > n) throw new IllegalArgumentException("Binominal coefficients are not defined for k greater than n");
		if (k < 0) throw new IllegalArgumentException("Binominal coefficients are not defined for negative numbers");
		if (k == 0) return 1;
		if (n == 0) return 0;
		long b = 1;
		for (int i = 1; i <= k; i++) {
			b *= (n - k + i);
			b /= i;
			}
		return b;
		}
	
	/**
	 * Calculates the value of the <code>i</code><sup>th</sup> base Bernstein polynomial
	 * of <code>degree</code>.
	 * 
	 * @param i Which basis polynomial.
	 * @param degree The degree of the polynomial. 
	 * @param x The input.
	 * @return The result.
	 * @throws IllegalArgumentException when <code>degree</code> or <code>i</code> are negative,
	 *         or <code>i</code> is greater than <code>degree</code>.
	 */
	public static double bernsteinBasisPolynomial(int i, int degree, double x) {
		return binomialCoefficient(degree, i)*power(x, i)*power(1 - x, degree - i);
		}

	}
