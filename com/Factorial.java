package com;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		int i, a, fact=1;
		Scanner scan =new Scanner(System.in);
		System.out.println( "Please enter the number");
		a =scan.nextInt();
		for(i=1; i<=a; i++)
		fact=fact*i;
		System.out.println("Factorial of No "+a+" is =" +fact);
	}
}
