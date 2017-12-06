package com;

public class SwapVariable 
{
	//to swap two variables without using third

	public static void main(String[] args)
	{
		int a=10; int b=20; int temp;
		 
		 /* a=a*b;
		  b=a/b;
		  a=a/b; */
		
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		  
		  temp =a;
		  a=b;
		  b=temp;
		  
		System.out.println("a is :"+ a);
		System.out.println("a is :" +b);
	}

}
