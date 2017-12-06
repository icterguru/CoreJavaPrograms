package test;

import com.calculator;

import junit.framework.TestCase;
 
public class CalculatorTester extends TestCase {
	calculator c =new calculator();

	public void testAdd() {
		assertEquals("Result", 15, c.add(10,5));
	}

	public void testSub() {
		assertEquals("Result", 5, c.sub(10,5));
	}
}
