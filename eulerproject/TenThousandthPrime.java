package eulerproject;

public class TenThousandthPrime 
{
	private static boolean isPrime(long n)
	{
		// return false if not prime, true if prime
		if ((n%2==0) && (n != 2))
			return false;              // is even, therefore not prime

		for (long i=3; i * i <=n; i +=2)    //skip all the even 
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) 
	{
		long start = System.currentTimeMillis();
		int numPrimes = 1; 
		long i =2;
		while (numPrimes <=10001)
		{
			if (isPrime(i))
			{
				numPrimes++;
				i++;
			}
			else i++;
		}
		long end = System.currentTimeMillis();
		System.out.println(i-1);
		System.out.println(end - start + "ms");
	}
}



/*int n=10001, status = 1, num = 3;

System.out.println(2);

for ( int count = 2 ; count <=n ;  )
{
	for ( int j = 2 ; j * j <= num ; j++ )
	{
		if ( num%j == 0 )
		{
			status = 0;
			break;
		}
	}
	if ( status != 0 )
	{
		System.out.println(count +":" + num);
		count++;
	}
	status = 1; 
	num++;
}    

 */