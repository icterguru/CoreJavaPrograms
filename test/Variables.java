package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Variables extends TestVariables 
{
	public String a,b,c,s, D;
	public int i,j,k, L;
	public double l,m,n;

	Scanner scan=new Scanner(System.in);

	public Variables()
	{
	}
	public Variables(Date dt,String a, String b, String c, String s, String D,  int i, int j, int k, int L, double l, double m, double n)
	{
		this.a=a; this.b=b;	this.c=c; this.i=i; this.j=j; this.k=k; this.l=l; this.m=m; this.n=n; this.L=L;	this.D=D; 
	}

	public int addIntegers()
	{
		System.out.println("Please enter First Integer");
		i=scan.nextInt();
		System.out.println("Please enter Second Integer");
		j=scan.nextInt();
		System.out.println("Please enter Third Integer");
		k=scan.nextInt();
		return (i+j+k);
	}
	public double addDecimals()
	{
		System.out.println("Please enter First Decimal");
		l=scan.nextDouble();
		System.out.println("Please enter Second Decimal");
		m=scan.nextDouble();
		System.out.println("Please enter Third Double");
		n=scan.nextDouble();
		return l+m+n;
	}
	public String concatStrings()
	{
		System.out.println("Please enter First Name");
		a=scan.next();
		System.out.println("Please enter Middle Name");
		b=scan.next();
		System.out.println("Please enter Last Name");
		c=scan.next();
		return a+" "+b+" "+c;
	}
	public int calcStringLength()
	{
		try 
		{
			BufferedReader bf=new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Please enter the string to calculate length");
			s=bf.readLine();
			L=s.length();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return L;
	}
	public String dateFormat()
	{
		Date date=new Date();
		try {
			BufferedReader bf=new BufferedReader (new InputStreamReader (System.in));
			System.out.println("Please enter  Date that you want to format ");
			D=bf.readLine();
			DateFormat longFormatter = SimpleDateFormat.getDateInstance(SimpleDateFormat.LONG);
			//date =longFormatter(D);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 

		return date.toString();
	}
}
