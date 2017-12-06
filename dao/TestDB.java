/*
 * Created by Anurag Bhusari 20 FEB  2010
 *# All SQL

CREATE TABLE customer
(First_Name varchar2(10),
 Last_Name varchar2(10))

drop table customer

INSERT INTO customer VALUES ('Anurag', 'Bhusari')

INSERT INTO customer VALUES ('Anurag1', 'Bhusari1')

UPDATE customer SET Last_Name='temp' WHERE Last_Name='Bhusari'

delete from customer  WHERE Last_Name='Bhusari1'

Select * from customer 
 * 
 * */
package dao;
import java.sql.*;

public class TestDB
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
	// Following method is used to select from table using preparedStatement
	public void select(String S)
	{

		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement("Select * from customer where First_Name like ?");

			//Initialize first parameter with email address
			pstmt.setString(1, S);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				String s = rs.getString("First_Name");
				String n = rs.getString("Last_Name");
				System.out.println(s + "   " + n);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// Following method is a simple select
	public void doSelectTest( )
	{
		System.out.println("[OUTPUT FROM SELECT]");
		String query = "Select * from customer";
		try
		{
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next())
			{
				String s = rs.getString("First_Name");
				String n = rs.getString("Last_Name");
				System.out.println(s + "   " + n);
			}
		}
		catch (SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
	}
	// Following method inserts
	public void doInsertTest()
	{
		System.out.print("\n[Performing INSERT] ... ");
		try
		{
			Statement st = conn.createStatement();
			st.executeUpdate("INSERT INTO customer VALUES ('Samuel', 'BaskarRaj')");
			System.out.println("Insert succesful");
		}
		catch (SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
	}
	// Following method updates
	public void doUpdateTest()
	{
		System.out.print("\n[Performing UPDATE] ... ");
		try
		{
			Statement st = conn.createStatement();
			st.executeUpdate("UPDATE customer SET Last_Name='Bhu' WHERE Last_Name='Bhusari'");
			System.out.println("Update succesful");
		}
		catch (SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
	}
	// Following method delete
	public void doDeleteTest()
	{
		System.out.print("\n[Performing DELETE] ... ");
		try
		{
			Statement st = conn.createStatement();
			st.executeUpdate("delete from customer  WHERE Last_Name='Bhusari11'");

			System.out.println("Delete succesful");
		}
		catch (SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
	}
}




