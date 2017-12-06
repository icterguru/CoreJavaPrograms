package com;

public class Manager 
{
	public static void main(String[] args) 
	{
		Employee e1= new Employee();
		e1.fullName="Anurag Bhusari";
		e1.id="Idha-55";
		e1.salary=8000;
		e1.title="HR";

		System.out.println("New Salary is "+e1.getNewSalary());
		e1.printEmployeeDetails();
		System.out.println("******************************");

		Employee e2=new Employee("Baskar","123",5000,"HR");
		System.out.println("New Salary is "+e2.getNewSalary());
		e2.printEmployeeDetails();
		System.out.println("*******************************");
		
		Employee e3=new Employee("Tarun","321",6500,"Manager");
		System.out.println("New Salary is "+e3.getNewSalary());
		e2.printEmployeeDetails();
		System.out.println("*******************************");
	}
}
