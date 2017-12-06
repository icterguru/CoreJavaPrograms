package eulerproject;

public class SmallestMultiple {

	public int smallestEvenlyDivisible(int end)
	{
		int num=0;
		boolean finished =false;
		for (num=2; !finished; num +=2)
		{
			boolean evenlyDivisible = true;
			for(int divisor = 2; divisor <= end; divisor++)
			{
				if(num%divisor !=0)
				{
					evenlyDivisible=false;
				}
			}
			if(evenlyDivisible)
			{
				System.out.println(num);
				finished = true;
			}
		}
		return num;
	}

	public static void main(String[] args) 
	{
		SmallestMultiple prog = new SmallestMultiple();
		long start = System.currentTimeMillis();
		prog.smallestEvenlyDivisible(5);
		long end = System.currentTimeMillis();
		System.out.println("Time taken for the process is :"+ (end- start));

		/*long start = System.currentTimeMillis();
		prog.smallestEvenlyDivisible(20);
		long end = System.currentTimeMillis();
		System.out.println("Time taken for the process is :"+(end - start)); */
	}
}