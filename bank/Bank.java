package bank;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Bank implements BankInterfaceFinal 
{
	String Name;
	String AcctNum, fromAccNum, toAccNum;
	double Amount;

	public Bank()
	{
	}
	public Bank(String name, String actnum, double bal)
	{
		Name=name;
		AcctNum=actnum;
		Amount=bal;
	}
	public void getBalance(String AcctNum) 
	{
		File f=new File("c:/Baskar/Java/customeraccounts.txt");
		try 
		{
			Scanner scan=new Scanner(f);

			while(scan.hasNext())
			{
				String line=scan.nextLine();

				String temp[]=line.split(" ");
				Bank b=new Bank(temp[0],temp[1],Double.parseDouble(temp[2]));
				
				if(b.AcctNum.equalsIgnoreCase(AcctNum))
				{
					System.out.println("Balance of "+AcctNum+" is  :"+b.Amount);
					
				}
				else if(b.AcctNum.equalsIgnoreCase(" "))
				{
					System.out.println("Please enter the valid account number");
				}
				else
				{
					System.out.println("Account Number Entered doesn't match, Please try again");
					break;
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void deposit(String AcctNum, double Amount) 
	{
		File f=new File("c:/Baskar/Java/customeraccounts.txt");
		try {
			Scanner scan=new Scanner(f);
			while(scan.hasNext())
			{
				String line=scan.nextLine();

				String temp[]=line.split(" ");
				Bank b=new Bank(temp[0],temp[1],Double.parseDouble(temp[2]));
				
				if(b.AcctNum.equalsIgnoreCase(AcctNum))
				{
					System.out.println("Amount Deposited to "+AcctNum+" is  :"+Amount);
					System.out.println("Balance of "+AcctNum+" is  :"+(b.Amount+Amount));
					break;
				}
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void transfer(String toAcctNum,String fromAcctNum, double Amount) 
	{
		File f=new File("c:/Baskar/Java/customeraccounts.txt");
		try {
			Scanner scan=new Scanner(f);
			while(scan.hasNext())
			{
				String line=scan.nextLine();

				String temp[]=line.split(" ");
				Bank b=new Bank(temp[0],temp[1],Double.parseDouble(temp[2]));
				if(b.AcctNum.equalsIgnoreCase(AcctNum))
				{
					System.out.println("Amount Transfered from A/c No. "+fromAcctNum+" to A/c No "+toAcctNum+" is  :"+Amount);
					System.out.println("Balance of "+fromAcctNum+" is  :"+(b.Amount-Amount));
					System.out.println("Balance of "+toAcctNum+" is  :"+(b.Amount+Amount));
					break;
				}
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void withdraw(String AcctNum, double Amount) 
	{
		File f=new File("c:/Baskar/Java/customeraccounts.txt");
		try {
			Scanner scan=new Scanner(f);
			while(scan.hasNext())
			{
				String line=scan.nextLine();

				String temp[]=line.split(" ");
				Bank b=new Bank(temp[0],temp[1],Double.parseDouble(temp[2]));
				if(b.AcctNum.equalsIgnoreCase(AcctNum))
				{
					System.out.println("Amount Withdrawn from "+AcctNum+" is  :"+Amount);
					System.out.println("Balance of "+AcctNum+" is  :"+(b.Amount-Amount));
					break;
				}
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void writeToFile(String filePath,String fileContent)
	{
		try
		{ 	// Create file 
			FileWriter fstream = new FileWriter("c:/Baskar/Java/customeraccounts", true);
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
}