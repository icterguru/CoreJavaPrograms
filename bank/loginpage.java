package bank;

import java.util.Scanner;

public class loginpage 
{
	public static void main(String[] args) 
	{
		login ln=new login();

		String Name,login, passwd;
		Scanner input= new Scanner(System.in);

		System.out.println("What operation would you like to perform \n1:for Create an Account  \n2:for Logon");
		int choice=input.nextInt();

		if(choice==1)
		{
			System.out.println("Please enter your Loginid :");
			login=input.next();

			System.out.println("Please enter your Password :");
			passwd=input.next();

			ln.createAccount(login, passwd);
		}
		else 
			if (choice==2)
			{
				System.out.println("Please enter your Name :");
				Name=input.next();

				System.out.println("Please enter your Loginid :");
				login=input.next();

				System.out.println("Please enter your Password :");
				passwd=input.next();

				ln.logOn(Name, login, passwd);
			}
	}
}