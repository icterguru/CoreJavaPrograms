package test;

import java.util.Scanner;

public class FindCharCase 
{
	 FindCharCase()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the character to find the case :");
		String s= scan.next();
		char ch = s.charAt(0);

		if (ch>='A'&&ch<='Z')
			System.out.println("Character is upper case");

		else 
			System.out.println("Character is lower case");
	}
	public static void main(String[] args)
	{
		new FindCharCase();
	}
}