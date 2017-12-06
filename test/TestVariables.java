package test;

import java.util.Scanner;


abstract class TestVariables 
{
	public static void main(String[] args) 
	{
		Variables V=new Variables();
		Scanner scan=new Scanner(System.in);

		System.out.println("Please type in \n1:for Add Integers\n2:for Add Decimals\n3:for Concatenate Strings\n4:for Calculate String Length\n5:for Date Formatting");
		int choice = scan.nextInt();

		if(choice==1)
		{
			System.out.println("Addition of 3 integers is :" +V.addIntegers());
		}
		else if(choice==2)
		{
			System.out.println("Addition of 3 decimals is :" +V.addDecimals());
		}
		else if(choice==3)
		{
			System.out.println("Your Fullname is :" +V.concatStrings());
		}
		else if(choice==4)
		{
			System.out.println("Length of the String you entered is :" +V.calcStringLength());
		}
		else if (choice==5)
		{
			System.out.println("The Date you entered is :" +V.dateFormat());
		}
	}
} 