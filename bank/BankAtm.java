package bank;

import java.util.Scanner;

public class BankAtm 
{
	public static void main(String[] args) 
	{
		Bank b=new Bank ();
		String Name, AccNum, fromAccNum,toAccNum;
		double Amount;
		Scanner scr=new Scanner(System.in);

		System.out.println("Welcome to the ATM");
		System.out.println("Please enter your Account Number :");
		AccNum=scr.next();

		System.out.println("What operation would you like to perform \n1.Check Balance \n2. Deposit \n3.Withdraw \n4.Balance Transfer");
		int choice=scr.nextInt();

		if (choice==1)
		{ 
			System.out.println("Enter the Account Number :");
			AccNum =scr.next();
			{
				b.getBalance(AccNum);
			}
		}

		else if (choice==2)
		{
			System.out.println("Enter the amount to deposit :");
			Amount =scr.nextDouble();
			{
				b.deposit(AccNum, Amount);
			}
		}
		else if(choice==3)
		{
			System.out.println("Enter the amount to withdraw :");
			Amount = scr.nextDouble();
			{
				b.withdraw(AccNum, Amount);
			}
		}	
		else if(choice==4)
		{
			System.out.println("Enter the Account No. from which you wish to Transfer Amount :");
			fromAccNum =scr.next();
			System.out.println("Enter the amount to Transfer :");
			Amount =scr.nextDouble();
			System.out.println("Enter the Account Number to Transfer :");
			toAccNum =scr.next();
			{
				b.transfer(fromAccNum, toAccNum, Amount);
			}
		}				
		else
		{
			System.out.println("Exit");
		}
	}
}