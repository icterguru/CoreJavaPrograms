package eulertest;

import eulerproject.NumberSort;
import junit.framework.TestCase;

public class NumberSortTest extends TestCase {
	NumberSort numberSort;


	protected void setUp() throws Exception {
		super.setUp();
		numberSort = new NumberSort();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}


	public void testsort1() throws Exception {
		int[] intArr={5,3,78,46};
		numberSort.sort(intArr);
		assertEquals("lowest no. must be 3", 3, intArr[0]);
	}


	public void testsort2() throws Exception {
		int[] intArr={5,78,46, 3};
		numberSort.sort(intArr);
		assertEquals("highest no. must be 78",78, intArr[3]);
	}


	public void testsort3() throws Exception {
		int[] intArr={5,0,-4, 3};
		numberSort.sort(intArr);
		assertEquals(-4, intArr[0]);
	}
}
