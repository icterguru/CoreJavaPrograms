package bank;
public class calculator 
{
	public int add(int i,int j)
	{
		int result=(i+j);
		return result;
	}
	public int subtract(int i,int j)
	{
		int result=(i-j);
		return result;
	}
	public int multiply(int i,int j)
	{
		int result=(i*j);
		return result;
	}
	public int divide(int i,int j)
	{
		int result=(i/j);
		return result;
	}
	public int modulus(int i,int j)
	{
		int result=(i%j);
		return result;
	}
	public double salary(double pay)
	{	
		if (pay<5000)
		{
			double NewSalary=(pay+(pay*0.2));
			return NewSalary;
		}	
		else if (pay>5000)
		{
			double NewSalary=(pay+(pay*0.1));
			return NewSalary;
		}	
		else 
		{
			double NewSalary=(pay+(pay*0.15));
			return NewSalary;
		}	
	}
}
