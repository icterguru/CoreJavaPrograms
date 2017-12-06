package com;

import java.util.Scanner;

public class Todaysdate 
{
	public static void main(String[] args) 
	{ 
		String D,M,Y,date;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter today's day");
		D = s.next();
		System.out.println("Please enter today's month");
		M = s.next();
		System.out.println("Please enter today's year");
		Y = s.next();

		date = M +"-"+ D+"-" +Y;
		
		/***Date d=new Date();
		System.out.println(d);***/

		System.out.println("Today's date :"+date);
	}
}
