package bank;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class login 
{
	String Name,Loginid, Password;

	public login()
	{
	}
	public login(String name,String login, String passwd)
	{
		Name=name;
		Loginid=login;
		Password=passwd;
	}
	public String logOn(String Name, String Loginid, String Password) 
	{
		File f=new File("c:/Baskar/Java/useraccounts.txt");
		try 
		{
			Scanner scan=new Scanner(f);

			while(scan.hasNext())
			{
				String line=scan.nextLine();

				String temp[]=line.split(" ");
				login ln=new login(temp[0], temp[1],temp[2]);

				if(Loginid.equals(Loginid) && Password.equals(Password))
				{
					System.out.println("You have entered Loginid and Password Correctly. Welcome to the yahoo mail");
					break;
				}
				else if (Loginid.equalsIgnoreCase(Loginid) | Password.equalsIgnoreCase(Password))			
				{
					System.out.println("You have entered Loginid or Password Incorrectly. Please try again");
					break;
				}
				else 
					if	(Password.equalsIgnoreCase(" "))		
				{
					System.out.println("Please enter password mandatory!");
					break;
				}
			}
		} 
		catch (FileNotFoundException e) 
		{
		}
		return null;
	}
	
	public String createAccount(String loginid, String password)
	{
		writeToFile("c:/Baskar/Java/NewAccounts.txt",loginid+" "+password);
		System.out.println("Account has been successfully created");
		return null;
		
	}
	
	public void writeToFile(String filePath,String fileContent)
	{
		try
		{
			// Create file 
			FileWriter fstream = new FileWriter(filePath, true);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(fileContent);
			out.newLine();
		    out.close();     //Close the output stream 
		}
		catch (Exception e)
		{
			System.err.println("Error: " + e.getMessage());   //Catch exception if any
		}
	}
}
