package eulertest;

import eulerproject.SmallestMultiple;
import junit.framework.TestCase;

public class SmallestMultipleTest extends TestCase {
	SmallestMultiple smallMultiple;

	protected void setUp() throws Exception {
		super.setUp();
		smallMultiple = new SmallestMultiple();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSmallMultiple1()throws Exception {
		int result = smallMultiple.smallestEvenlyDivisible(5);
		assertEquals(60,result);
	}
}
