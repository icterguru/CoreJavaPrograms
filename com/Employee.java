package com;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;

import Collections.ArrayListCode;

public class Employee
{
	public String fullName;
	public String id;
	public double salary;
	public String title;

	public Employee()
	{
	}
	public Employee(String name, String id, double sal, String title)
	{
		fullName=name;
		this.id=id;
		salary=sal;
		this.title=title;
	}
	public double getempSalary(String ename, ArrayList<Employee> list)
	{	 
		for(int i=0; i<list.size(); i++)
		{
			Employee e=list.get(i);  //doesn't delete anything

			if (e.fullName.equalsIgnoreCase(ename))
			{ 
				return e.salary;
			}
		}
		return 0;
	}

	public int getempSeq(String eid, ArrayList<Employee> list)
	{	   
		for(int i=0; i<list.size(); i++)
		{
			Employee e=list.get(i);  //doesn't delete anything		
		}
		return 0;
	}

	public double getNewSalary()
	{
		if (salary>5000)
		{
			return salary+1000;
		}
		else
		{
			return (salary*.1)+salary;
		}
	}

	public void createNewEmployee()
	{

		String line=(fullName+" "+id+" "+salary+" "+title);

		writeToFile("c:/Baskar/Java/newemployees.txt", line);
		
	}
	

	public double calculateRaise()
	{
		return (salary *.1)+salary;
	}

	public void writeToFile(String filePath,String fileContent)
	{
		try
		{ 	// Create file 
			FileWriter fstream = new FileWriter(filePath, true);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(fileContent);
			out.newLine();
			out.close();     //Close the output stream
		}
		catch (Exception e)
		{
			System.err.println("Error: " + e.getMessage());     //Catch exception if any
		}
	}
	public void printEmployeeDetails()
	{
		System.out.println(fullName);
		System.out.println(id);
		System.out.println(salary);
		System.out.println(title);
	}
}

