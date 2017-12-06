package com;

import java.util.Scanner;
import bank.CalcInterface;
public class calculator implements CalcInterface
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the Firstnumber");
		double x = s.nextDouble();
		System.out.println("Please enter the Secondnumber");
		double y = s.nextDouble();
		System.out.println("Please type in \n1:for Addition\n2:for Subtraction\n3:for Multiplication\n4:for Division\n5:for Modulus");
		int choice = s.nextInt();

		if(choice==1)
		{
			System.out.println("Addition is "+(x+y));
		}
		else if(choice==2)
		{
			System.out.println("Subtraction is "+(x-y));
		}
		else if(choice==3)
		{
			System.out.println("Multiplication is "+(x*y));
		}
		else if(choice==4)
		{
			System.out.println("Division is "+(x/y));
		}
		else if(choice==5)
		{
			System.out.println("Modulus is "+(x%y));
		}
		else
		{
			System.out.println("Please choose from an option");
		}
	}

	public int add(int i, int j) 
	{
		return i+j;
	}
	public int sub(int i, int j) 
	{
		return i-j;
	}
	public int mul(int i, int j) 
	{
		return i*j;
	}
	public int div(int i, int j) 
	{
		return i/j;
	}

	public double add(double d, double e)
	{
		return 0;
	}
}	