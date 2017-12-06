package bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDao 
{
	String name, id, author, mode, cash, credit;

	public Connection conn;
	//Function to be called to create a connection with the DB Server 
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

	public void addMoreBooks( String name, String id, String author)
	{
		System.out.print("\n[Performing Addition] ... ");
		try
		{
			Statement st = conn.createStatement();
			String query="create table bookstore (BookName varchar2(25), BookId varchar2(10),BookAuthor varchar2(25))";
			String query1="INSERT into bookstore SET BookId='"+id+"' BookName='"+name+"' BookAuthor='"+author+"'";
			st.executeUpdate(query);
			st.executeUpdate(query1);
			System.out.println("Book Added succesfully");
		}
		catch (SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
	}

	public void removeBooks(String id)
	{
		System.out.print("\n[Performing Deletion] ... ");
		try
		{
			Statement st = conn.createStatement();
			String query="DELETE from bookstore where BookID='"+id+"'";

			st.executeUpdate(query);

			System.out.println("Book Removed succesfully");
		}
		catch (SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
	}

	public void countTotalBooks()
	{
		System.out.print("\n[Performing Counting] ... ");
		try
		{
			Statement st = conn.createStatement();
			String query="select count(*) from bookstore";

			st.executeUpdate(query);

			System.out.println("Total Book Counted");
		}
		catch (SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
	}

	public void bookBySameAuthor(String author)
	{
		try
		{
			Statement st = conn.createStatement();
			String query="select * from bookstore where BookAuthor='"+author+"'";

			st.executeUpdate(query);

			System.out.println("Obtained books by Same Author");
		}
		catch (SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
	}
	public void paymentMode(String mode)
	{
		try
		{
			if (mode.equalsIgnoreCase(cash))
			{
				System.out.println("Paid By CASH");
			}
			else if (mode.equalsIgnoreCase(credit))
			{
				System.out.println("Paid By Credit");
			}
			else
			{
				System.out.println("Invalid Entry");
			}

		}
		catch (Exception ex) {}
	}

	public void close()
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
