package com;

import java.util.Scanner;

public class Football 
{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
	    calculator c=new calculator();
		int i=0;
	    try 
		{
		   i=c.div(14,7); 
		   System.out.println(i);
		} 
		catch (Exception e1) 
		{
			e1.printStackTrace();
		}
		System.out.println(" Please Enter your age or press 0 to exit");
		try 
		{
			int age=scan.nextInt();
			if(age>55)
			{
				throw new BaskarException();
			}
		} 
		catch (BaskarException e)
		{
			e.writeToText("Your age is greater than 55 you are not eligible for playing professional Footbal");
		}
	}
}
