package bankdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class BankDao 
{
	public Connection conn;
	//Function to be called to create/establish a connection with 
	//the Database Server 
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
	// Following method is used to get the balance for the customer's account
	//It uses the SELECT SQL query which is modified and set to take accno 
	//from user and the query is sent 
	//It requires only a single argument of String type to be passed 
	//into it when it is called
	public void getBalance(String accno )
	{
		System.out.println("[OUTPUT FROM SELECT]");
		
		//the following statement represents the final query statement sent as request
		//the values of the accno variable are appended accordingly
		//and the query is saved as a sentence(String)
		String query = "Select * from bank where Acc_no='"+accno+"'";
		try
		{
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while (rs.next())
			{
				String name = rs.getString("Acc_Name");
				String acno = rs.getString("Acc_No");
				String bal = rs.getString("Acc_Balance");
				System.out.println("Name :"+name );
				System.out.println("Account No: " +acno);
				System.out.println("Balance : "+bal);
			}
		}
		catch (SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
	}


	// Following method is used to deposit any amount into the customer account
	//It uses the update SQL query which is modified and set to take accno 
	//and amount from user and the query is sent 
	//It requires two arguments of String type to be passed 
	//into it when it is called
	public void deposit(String accno, String amount)
	{
		System.out.print("\n[Performing UPDATE] ... ");
		try
		{
			Statement st = conn.createStatement();
			//the following statement represents the final query statement sent as request
			//the values of the accno and amount variable are appended accordingly
			//and the query is saved as a sentence(String)
			String query="UPDATE bank SET Acc_balance=Acc_balance+"+amount +" WHERE Acc_No='"+accno+"'";
			st.executeUpdate(query);
			System.out.println("Deposit succesful");
		}
		catch (SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
	}
	// Following method is used to withdraw any amount from the customer account
	//It uses the update SQL query which is modified and set to take accno 
	//and amount from user and the query is sent
	//It requires two arguments of String type to be passed 
	//into it when it is called
	public void withdraw(String accno,String amount)
	{
		System.out.print("\n[Performing UPDATE] ... ");
		try
		{
			Statement st = conn.createStatement();
//			the following statement represents the final query statement sent as request
			//the values of the accno and amount variable are appended accordingly
			//and the query is saved as a sentence(String)
			String query="UPDATE bank SET Acc_balance=Acc_balance-"+amount +" WHERE Acc_No='"+accno+"'";
			st.executeUpdate(query);
			System.out.println("Withdraw succesful");
		}
		catch (SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
	}

	
	//Function to be called to close the Database Server Connection
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
