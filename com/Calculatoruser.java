package com;

import bank.calculator;

public class Calculatoruser 
{

	public static void main(String[] args)
	{
		calculator c = new calculator();
		System.out.println(c.subtract(8,6));
		System.out.println(c.add(8,6));
		System.out.println(c.multiply(8,6));
		System.out.println(c.modulus(8,6));
		System.out.println( "NewSalary :" +c.salary(5000));
	}
}
