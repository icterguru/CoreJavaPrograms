package Collections;

import java.io.File;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.Employee;
public class MapCode 
{
	public static void main(String[] args) 
	{
		File f=new File("c:/Baskar/Java/employee.txt");
		
		Map<String, Employee> map=new HashMap<String, Employee>(); 
		try 
		{
			Scanner scan=new Scanner(f);
			while(scan.hasNext())
			{
				String line=scan.nextLine();

				String temp[]=line.split(" ");
				Employee e=new Employee(temp[0], temp[1], Double.parseDouble(temp[2]), temp[3]);
				map.put(e.fullName, e);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Please give me the name of an Employee for me to give you the Employee Details :");
		String ename=scan1.next();

		Employee temp=map.get(ename);
		String EmpDetails = (temp.fullName +" "+ temp.id+ " "+temp.salary+ " "+temp.title);
		//System.out.println(temp.fullName);
		//System.out.println(temp.id);
		//System.out.println(temp.salary);
		//System.out.println(temp.title);
		System.out.println(EmpDetails);
	}  
}
