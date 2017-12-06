package test;

public class B extends A
{
	public void foo() { System.out.print("Bfoo "); }
	public static void main(String[] args) 
	{
		A a = new B();
		B b = (B)a;
		a.foo();
		b.foo();
	}
}