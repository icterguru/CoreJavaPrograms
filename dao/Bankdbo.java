package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Bankdbo 
{
	public Connection conn;
    //Following method creates connection
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
	public void deposit(String ActNum, String Amt)
	{
		System.out.print("\n[Performing UPDATE] ... ");
		try
		{
			Statement st = conn.createStatement();
			st.executeUpdate("UPDATE BankAccounts SET ACC_Amount=ACC_Amount+"+Amt+" where Acc_Number='"+ActNum+"'");
			System.out.println("Update succesful");
		}
		catch (SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
	}
	public void withdraw(String ActNum, String Amt)
	{
				System.out.print("\n[Performing UPDATE] ... ");
		try
		{
			Statement st = conn.createStatement();
			st.executeUpdate("UPDATE BankAccounts SET Acc_Amount=Acc_Amount-"+Amt+" where Acc_Number='"+ActNum+"'");
			System.out.println("Update succesful");
		}
		catch (SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
	}
	public void transfer(String fromActNum, String toActNum,String Amt)
	{
				System.out.print("\n[Performing UPDATE] ... ");
		try
		{
			Statement st = conn.createStatement();
			st.executeUpdate("UPDATE BankAccounts SET Acc_Amount=Acc_Amount+"+Amt+" where Acc_Number='"+toActNum+"'");
			st.executeUpdate("UPDATE BankAccounts SET Acc_Amount=Acc_Amount-"+Amt+" where Acc_Number='"+fromActNum+"'");
			
			System.out.println("Update succesful");
		}
		catch (SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
	}	
}
