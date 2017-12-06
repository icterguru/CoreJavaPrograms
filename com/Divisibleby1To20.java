package com;

public abstract class Divisibleby1To20 {

	public static int gcd(int n1, int n2) {    
		return (n2 == 0) ? n1 : gcd(n2, n1 % n2);
	}   
	public static int lcm(int n1, int n2) { 
		return n1 * n2 / (gcd(n1, n2)); 
	}   
	public static int lcm(int[] numbers) {  
		int lcm = lcm(numbers[0], numbers[1]);   
		for (int i = 2; i < numbers.length; ++i)
			lcm = lcm(lcm, numbers[i]);        
		return lcm; 
	}  
	public static void main(String args[]) {  
		int[] numbers = { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11 }; 
		//System.out.println(lcm(numbers)); 
		//System.out.println(gcd(8, 5));
		System.out.println(lcm(8,5));
		} 

}

