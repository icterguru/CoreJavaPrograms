package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo 
{ 
	private DateDemo() 
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the Date in dd-MM-yyyy format :");
		String date =scan.next();
		try {
			SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy"); 
			Date convertedDate = df.parse(date);
			System.out.println("Converted string to date : " + convertedDate);
		} 
		catch (ParseException e) 
		{  
			e.printStackTrace();
		} 
	}
	public static void main(String[] args) 
	{ 
		new DateDemo(); 
	} 
} 