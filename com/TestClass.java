package com;

public class TestClass 
{
	public float parseFloat( String s )
	{
		float f = 0.0f;
		try
		{
			f = Float.valueOf(s).floatValue();
			return f ;
		}
		
		catch(NumberFormatException nfe)
		{
			f = Float.NaN ;
			//	return f;
		}
		finally
		{
			//f = 10.0f;
			System.out.println(f);
			return f;
		}
	}
	public static void main(String[] args) {

		TestClass tc = new TestClass();
		tc.parseFloat("10.5");
	}	
}









