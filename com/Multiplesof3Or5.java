package com;

public class Multiplesof3Or5 {

	public static void main(String[] args) {

		int result =0;
		for(int i=1; i<1000; i++)
		{
			if ((i%5==0) || (i%3==0))
			{
				System.out.print(i +" ");
				result +=i;
			}
		} 
		System.out.println();
		System.out.print(result);
	}
}



