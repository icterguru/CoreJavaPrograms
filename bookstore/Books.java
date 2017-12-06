package bookstore;
import java.util.Scanner;

public class Books 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int opt; 
		BookDao dao = new BookDao(); 

		System.out.println("\t Welcome To Book Store");
		System.out.println("Please choose the operation you would like to do from the following list :");
		System.out.println("\t 1.  Add More Books");
		System.out.println("\t 2.  Remove Books");
		System.out.println("\t 3.  Get Total Count of Books ");
		System.out.println("\t 4.  List of Books by Same Author ");
		System.out.println("\t 5.  Payment Mode");
		System.out.print("Please Enter your choice now : ");
		opt= scan.nextInt();
		
		if ( opt==1 )
		{
			System.out.println("Please Enter the Book Name ");
			dao.name=scan.next(); 

			System.out.println("Please Enter the Book Id ");
			dao.id=scan.next();

			System.out.println("Please Enter the Book Author ");
			dao.author=scan.next(); 

			dao.createConnection();
			dao.addMoreBooks(dao.name, dao.id, dao.author);
			dao.close();

		}
		else if (opt==2)
		{
			System.out.println("Please Enter Book Id to remove the book from list:  ");
			dao.id=scan.next();
			
			dao.createConnection();
			dao.removeBooks(dao.id);
			dao.close();
		}

		else if (opt==3)
		{
			dao.createConnection();
			dao.countTotalBooks();
			dao.close();
		}

		else if (opt==4)
		{
			System.out.println("Please Enter Author Name to get all the books by this author:  ");
			dao.author=scan.next();
			
			dao.createConnection();
			dao.bookBySameAuthor(dao.author);
			dao.close();
		}
		else if (opt==5)
		{
			System.out.println("Please enter the payment mode");
			dao.mode=scan.next();
			
			dao.createConnection();
			dao.paymentMode(dao.mode);
			dao.close();
		}
		else
		{
			//If the Choice is not between 1 to 5 the following message is printed
			System.out.println("  Invalid Choice of operation  ");
		}
	}

}

