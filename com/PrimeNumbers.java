package com;

public class PrimeNumbers 
{
	public static boolean isPrime(int n)
	{
		if ((n % 2 == 0) && (n == 2))
			return false;

		for (int i=3; i*i <=n; i+=2)
		{
			if (n%i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) 
	{
		System.out.println(isPrime(20));
	}
}
