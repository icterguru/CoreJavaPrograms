package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.Employee;

public class employeedatabase  
{
	public Connection conn;
	public void createConnection()
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver").newInstance();
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			conn = DriverManager.getConnection(url, "system", "system");

			System.out.println("Connection Successful");
		}
		catch (Exception e)     
		{
			System.err.println(e.getMessage());
		}
	}	
	public void getManagerNames()
	{
		System.out.println("[OUTPUT FROM SELECT]");
		String query = "Select * from Employee where Emp_Title='Manager'";
		try
		{
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next())
			{
				String s = rs.getString("Emp_Name")+" "+rs.getString("Emp_ID")+" "+rs.getString("Emp_Salary")+" "+rs.getString("Emp_Title");
				System.out.println(s);

				//String n =rs.getString("Emp_ID")
			}
		}
		catch (SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
	}
	public void doInsertEmployee()
	{
		System.out.print("\n[Performing INSERT] ... ");

		String fullName,id, title;
		double salary;

		Scanner input=new Scanner(System.in); 
		Employee temp=new Employee();
		System.out.println("Please Enter the Employee Name");
		temp.fullName= input.next();		
		System.out.println("Please Enter the Employee ID");
		temp.id=input.next();
		System.out.println("Please Enter the Employee Salary");
		temp.salary=input.nextDouble();
		System.out.println("Please Enter the Employee Title");
		temp.title=input.next();		
		try
		{
			Statement st = conn.createStatement();
			st.executeUpdate("INSERT INTO Employee VALUES ('"+temp.fullName+"', '"+temp.id+"','"+temp.salary+"','"+temp.title+"')");
			System.out.println("Insert succesful");
		}
		catch (SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
	}	
	public void readNInsertEmpList()
	{
		File f=new File("c:/Baskar/Java/EmpList.txt");

		String Name; 
		String Id; 
		double Salary;
		String Title;

		try 
		{
			Scanner scan=new Scanner(f);
			while(scan.hasNext())
			{
				String line=scan.nextLine();

				String temp[]=line.split(" ");
				Employee e=new Employee(temp[0], temp[1], Double.parseDouble(temp[2]), temp[3]);

				System.out.print("\n[Performing INSERT] ... ");

				Statement st = conn.createStatement();
				st.executeUpdate("INSERT INTO EmpList VALUES('"+temp[0]+"', '"+temp[1]+"', '"+temp[2]+"', '"+temp[3]+"')");
				System.out.println("Insert succesful");
			}

		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
	}
}
