package test;

public class TesterA 
{
	public static void main(String[] args) 
	{

		System.out.println(xmethod(5));
	}

	public static int xmethod(int n, long t) 
	{
		System.out.println("int");
		return n;
	} 

	public static long xmethod(long n) 
	{
		System.out.println("long");
		return n;  
	}
}







