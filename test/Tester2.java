package test;

public class Tester2 
{
	/**public int calculate(int n)
	{
		if (n<=1)
		{
			return 1;
		} else {
			return calculate (n-1)+n;
		}
	}
		public static void main(String[] args) 
		{ 
			Tester2 tester = new Tester2();
			System.out.println(tester.calculate(4));
		}*/


	public void printIt()
	{
		System.out.println("No Parameters");
	}
	public void printIt(String it)
	{
		System.out.println("two");
	}
	public static void main(String[] args) 
	{
		Tester2 tester = new Tester2();
		tester.printIt(" Hello");
	}  
}
/**********************************************/

