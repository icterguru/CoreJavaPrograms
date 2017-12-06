package com;

import java.util.Scanner;


public class LogicalCode
{
	public static void main(String[] args)
	{ 
		Scanner s = new Scanner(System.in);

		System.out.println("Please enter your age");

		int age=s.nextInt();


		if (age<=21)
		{
			System.out.println("You can't buy a beer");
		}
		else if (age>21 && age<=59)
		{
			System.out.println("your total is 20 $");
		}
		else 
		{
			System.out.println("your total is 15$");
		}
	}

}
