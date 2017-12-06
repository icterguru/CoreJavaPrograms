package test;


public class Test extends Abstract2
{
	public void method1()
		{
			super.method1();                 // To invoke the immediate parent class method
			System.out.println("Tester");
		}
	public static void main(String[] args) 
	{
		Test test = new Test();
		test.method1();
	}
}
