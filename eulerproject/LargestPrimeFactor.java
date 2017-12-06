package eulerproject;

public class LargestPrimeFactor {

   /*public long largestPrime(long numm) 
	{
		
		long largestFact=0;
		for(long i=2; i<numm; i++)
		{
			if(numm%i==0)
			{
				boolean isPrime=true;
				for (long j=2; j<i;j++)
				{
					if (i%j==0)
					{
						isPrime=false;
						break;
					}
				}
				if(isPrime)	
				{
					largestFact=i;
					System.out.print(largestFact+" ");  
				}
			}
		}
		return largestFact;
	} */

	public long largestPrime(long numm) 
	{
		long newnumm = numm;
		long largestFact = 0;

		long counter = 2;
		while (counter * counter < newnumm) 
		{
			if (newnumm % counter == 0) 
			{
				newnumm = newnumm / counter;
				largestFact = counter;
			}
			else 
			{
				counter++;
			}
		}
		if (newnumm > largestFact) 
		{ // the remainder is a prime number
			largestFact = newnumm;
			System.out.println(largestFact);
		}
		return largestFact;
	} 
	public static void main(String[] args) 
	{
		LargestPrimeFactor LPF = new LargestPrimeFactor();
		//LPF.largestPrime(600851475143);
		LPF.largestPrime(42);
	}
}

