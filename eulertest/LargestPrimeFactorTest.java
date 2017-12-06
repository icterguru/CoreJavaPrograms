package eulertest;

import eulerproject.LargestPrimeFactor;
import junit.framework.TestCase;

public class LargestPrimeFactorTest extends TestCase {
	LargestPrimeFactor largestPrimeFacor;

	protected void setUp() throws Exception {
		super.setUp();
		largestPrimeFacor = new LargestPrimeFactor();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testLargestPrime()throws Exception
	{
		long result = largestPrimeFacor.largestPrime(28);
		assertEquals(7, result);
	}
}
