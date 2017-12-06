package eulertest;

import eulerproject.LargestPalindrome;
import junit.framework.TestCase;

public class LargestPalindromeTest extends TestCase {
	static LargestPalindrome largestPalindrome;

	protected void setUp() throws Exception {
		super.setUp();
		largestPalindrome = new LargestPalindrome();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public static void testPalindrome1() throws Exception {
		boolean result=largestPalindrome.isPalindrome(99);
		assertTrue("99 is a Palindrome", result);
	}
	public static void testPalindrome2() throws Exception {
		boolean result=largestPalindrome.isPalindrome(909);
		assertTrue("909 is a Palindrome", result);     
	}
}
