package test;

import java.util.Scanner;

public class StringReverseExample 
{
	public static void main(String[] args)
	{
		//Scanner scan =new Scanner (System.in);
		
		//System.out.println("Please enter the string you want to reverse");
		//String string=scan.next();
		
		String string= "Hi How Are you";
		String reverse = new StringBuilder(string).reverse().toString();
		
		//System.out.println("String before reverse:"+string);
		
		System.out.println("String after reverse:"+reverse);
	} 
}


