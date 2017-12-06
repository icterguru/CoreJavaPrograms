package com;

public class Tester 
{
	static int someInt = 10;
	public static void changeIt(int a)
	{
		a =20;
	}
	
	public static void main(String[] args)	
	{ 
		changeIt(someInt);
		System.out.println(someInt);
		
		
//		/*int a=2;  int b=3;   int c = ++a + b--;
//		System.out.println(a);
//		System.out.println(b);*/
	}
}

