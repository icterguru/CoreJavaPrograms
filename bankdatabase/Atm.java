package bankdatabase;

import java.util.Scanner;

public class Atm 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int opt; //Variable to get user choice 
		Bank b = new Bank(); //New Object of Bank Class to call the Methods in Bank Class
		//Variables to get Account number  to proceed further

		while (true)
		{
		    System.out.println();
			System.out.println("\t Welcome ");
			System.out.println("Please choose the operation you would like to do from the following list :");
			System.out.println("\t 1.  Deposit Money");
			System.out.println("\t 2.  Withdraw Money");
			System.out.println("\t 3.  Tranfer a Balance ");
			System.out.println("\t 4.  Check your Balance ");
			System.out.println("\t 5.  Exit ");
			System.out.print("Please Enter your choice now : ");
			opt= scan.nextInt();
			if ( opt==1 )
			{
				System.out.println("Please Enter the Account Number :  ");
				b.accno1=scan.next(); //Get the Account Number From the User
				System.out.println("Please Enter the Amount you want to Deposit  :  ");
				b.bal=scan.next(); //Get the Amount to be Deposited
				b.deposit(b.accno1, b.bal);
			}
			else if (opt==2)
			{
				System.out.println("Please Enter the Account Number :  ");
				b.accno1=scan.next(); //Get the Account Number From the User
				System.out.println("Please Enter the Amount you want to Withdraw  :  ");
				b.bal=scan.next(); //Get the Amount to be Withdrawn
				b.withdraw(b.accno1, b.bal);
			}
			else if (opt==3)
			{
				System.out.println("Please Enter the Account Number from which you want to transfer:  ");
				b.accno1=scan.next();//Get the From Account Number From the User
				System.out.println("Please Enter the Account Number to which you want to transfer:  ");
				b.accno2=scan.next();//Get the To Account Number From the User
				System.out.println("Please Enter the Amount you want to Withdraw  :  ");
				b.bal=scan.next(); //Get the amount to be Transfered
				b.transfer(b.accno1, b.accno2, b.bal);
			}
			else if (opt==4)
			{
				System.out.println("Please Enter Your Account No : ");
				b.accno1=scan.next(); //Get the Account Number From the User
				b.checkbalance(b.accno1);
			}
			else if (opt==5)
			{
				System.out.println("\n\t Thank You. Have a Great Day!");
				System.exit(1);  //Used to Exit the Program
			}
			else
			{
				//If the Choice is not between 1 to 5 the following message is printed
				System.out.println("  Invalid Choice of operation  ");
			}
		}
	}
}
