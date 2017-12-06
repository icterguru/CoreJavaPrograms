 package com;
import java.util.Scanner;

public class CreateNewEmployee 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);

		System.out.println(" Please enter name");
		String name=scan.next();
		System.out.println(" Please enter id");
		String id=scan.next();
		System.out.println(" Please enter salary");
		double sal=scan.nextDouble();
		System.out.println(" Please enter designation");
		String title=scan.next();

		Employee temp =new Employee(name, id, sal,title);

		temp.createNewEmployee();
		temp.createNewEmployee();

		double newSalary=temp.calculateRaise();
		temp.salary=newSalary;
		System.out.println(temp.salary);

		System.out.println(" New employee created!!");
	}
}
