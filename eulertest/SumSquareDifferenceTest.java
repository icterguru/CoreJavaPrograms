package eulertest;

import eulerproject.SumSquareDifference;
import junit.framework.TestCase;

public class SumSquareDifferenceTest extends TestCase {
	SumSquareDifference sumsquaredifference;

	protected void setUp() throws Exception {
		super.setUp();
	sumsquaredifference = new SumSquareDifference();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	public void testSumSquareDiff1()throws Exception {
		long result = sumsquaredifference.sumSquareDiff(3);
		assertEquals(22, result);
	}

}
