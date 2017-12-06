package bank;

public interface BankInterfaceFinal
{
	public void getBalance(String AccNum);
	public void deposit(String acctNum,double amount);
	public void withdraw(String acctNum,double amount);
	public void transfer(String toAcctNum,String fromAcctNum,double amount);
}
