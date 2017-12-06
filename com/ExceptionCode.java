package com;

import java.util.Scanner;

public class ExceptionCode
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("Please enter your age or press 0 to exit");
		int age=0;

		try
		{
			age = scan.nextInt();
		} 
		catch (Exception e)
		{
			System.out.println("Please enter only number");
		}
		System.out.println(age);		
	}
}
