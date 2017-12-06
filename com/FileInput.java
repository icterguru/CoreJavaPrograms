package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import Collections.ArrayListCode;

public class FileInput 
{
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
	public static void main(String[] args)
	{
		ArrayList<Employee> list=new ArrayList<Employee>();

		File f=new File("c:/Baskar/Java/EmpList.txt");

		try 
		{
			Scanner scan=new Scanner(f);
			while(scan.hasNext())
			{
				String line=scan.nextLine();

				String temp[]=line.split(" ");
				Employee e=new Employee(temp[0], temp[1], Double.parseDouble(temp[2]), temp[3]);
				list.add(e);

				/*** System.out.println(line);
				fi.writeToFile("c:/Baskar/Java/out.txt", temp[0]+" "+temp[1]+" "+temp[3]+" "+e.getNewSalary());
				System.out.println("New Salary is :" +e.getNewSalary());   ****/
			}
		}	
		catch (FileNotFoundException e) 
		{
			e.printStackTrace(); 
		}
		Employee e=new Employee();

		double esal=e.getempSalary("Charles",list);       //list all the employees who earns more than charles
		for (int i=0; i<list.size(); i++)
		{
			e=list.get(i);
			if (e.salary>esal)
			{
				System.out.println(e.fullName);
			}
		}  
	} 
}