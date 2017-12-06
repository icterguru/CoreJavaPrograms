package bankdatabase;
public class Bank 
{
	String accno1;
	String accno2;
	String bal;

	BankDao db=new BankDao();
	
	public String checkbalance(String useraccountno) //function to be called to check balance returns "null" 
	{                                            //and everthing to be done is in the method itself
		// TODO Auto-generated method stub
		// gets Account Details(from Database) for Account No.(input from User)
		db.createConnection();
		db.getBalance(useraccountno);
		db.close();		
		return null;
	}
	
	public String deposit(String userAccountNo, String amount)//function to be called to deposit balance returns "null" 
	{                                            //and everthing to be done is in the method itself 
		// TODO Auto-generated method stub
		db.createConnection();
		db.deposit(userAccountNo, amount);
		db.close();
		return null;
	}

	public String transfer(String userAccountNoFrom, String userAccountNoTo, String amount) //function to be called to transfer balance returns "null" 
	{                                            											// and everthing to be done is in the method itself
		// TODO Auto-generated method stub
		db.createConnection();
		db.withdraw(userAccountNoFrom, amount);
		db.deposit(userAccountNoTo, amount);
		db.close();
		return null;
	}

	public String withdraw(String userAccountNo, String amount) //function to be called to deposit balance returns "null" 
	{									 						//and everthing to be done is in the method itself 
		// TODO Auto-generated method stub
		db.createConnection();
		db.withdraw(userAccountNo, amount);
		db.close();
		return null;
	}
}
