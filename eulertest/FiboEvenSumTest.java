package eulertest;

import eulerproject.FiboEvenSum;
import junit.framework.TestCase;

public class FiboEvenSumTest extends TestCase {
	FiboEvenSum fiboEvenSum;

	protected void setUp() throws Exception {
		super.setUp();
		fiboEvenSum = new FiboEvenSum();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
 
	public void testFiboEvenSum() throws Exception {
		int result = fiboEvenSum.fibonacciSum(20);
		assertEquals(10, result);
	}
}
