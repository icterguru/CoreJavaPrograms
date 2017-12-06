package com;
import java.util.Scanner;
public class Trignometric 
{
	public static void main(String[] args) 
	{		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the angle");

		double angle = scan.nextDouble();

		System.out.println("sin ("+angle+")value is :" +Math.sin(angle));
		System.out.println("cos ("+angle+")value is :" +Math.cos(angle));
		System.out.println("tan ("+angle+")value is :" +Math.tan(angle));

		double random = 25+(int)(Math.random()*75);

		System.out.println("A randomNumber is :" +Math.random());
	}
}

/**double angle =scanopt.nextDouble();
double sinvalue = Math.sin(angle);
double tanvalue = Math.tan(angle);***/