package bank;
import java.util.Scanner;

import dao.Bankdbo;
public class ATM 
{
	public static void main(String[] args) 
	{
		Bankdbo b=new Bankdbo();
		String ActNum,toActNum, fromActNum;
		String Amt;
		Scanner input= new Scanner(System.in);

		System.out.println("Welcome to the ATM machine");
		System.out.println("Please enter your Accountnumber :");
		ActNum=input.next();

		System.out.println("What operation would you like to perform \n1:for Deposit\n2:for Withdraw\n3:for AccountTransfer");
		int choice=input.nextInt();

		b.createConnection();

		if(choice==1)
		{
			System.out.println("Enter the amount to deposit :");
			Amt =input.next();
			{
				b.deposit(ActNum, Amt);
			}
		}
		else if(choice==2)
		{
			System.out.println("Enter the amount to withdraw :");
			Amt = input.next();
			{
				b.withdraw(ActNum, Amt);
			}
		}	
		else if(choice==3)
		{
			System.out.println("Enter the Account No. from which you wish to Transfer :");
			fromActNum =input.next();
			System.out.println("Enter the amount to Transfer :");
			Amt =input.next();
			System.out.println("Enter the Account Number to Transfer :");
			toActNum =input.next();
			{
				b.transfer(fromActNum, toActNum, Amt);
			}
		}				
	}
}