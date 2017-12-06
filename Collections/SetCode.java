package Collections;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.Employee;

public class SetCode 
{
	public static void main(String[] args)
	{
		File f=new File("c:/Baskar/Java/employee.txt");

		Set<String> setofManagers=new HashSet<String>();
		Set<String> setofHRs=new HashSet<String>();
		HashSet<String> setofDevelopers=new HashSet<String>();
		try 
		{
			Scanner scan=new Scanner(f);
			while(scan.hasNext())
			{
				String line=scan.nextLine();

				String temp[]=line.split(" ");
				Employee e=new Employee(temp[0], temp[1], Double.parseDouble(temp[2]), temp[3]);

				if(e.title.equalsIgnoreCase("Manager"))
				{
					setofManagers.add(e.fullName);
				}

				else if(e.title.equalsIgnoreCase("HR"))
				{
					setofHRs.add(e.fullName);
				}

				else if(e.title.equalsIgnoreCase("Developer"))
				{
					setofDevelopers.add(e.fullName);
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
		Scanner scan =new Scanner(System.in);

		System.out.println(" Please enter name");
		String name=scan.next();

		if(setofManagers.contains(name))
		{
			System.out.println(name+ " is a Manager");
		}
		else if(setofHRs.contains(name))
		{
			System.out.println(name+ " is a HR");
		}
		else if(setofDevelopers.contains(name))
		{
			System.out.println(name+ " is a Developer");
		}
		else 
		{
			System.out.println("Name entered is not in the list");
		}
	}
}
