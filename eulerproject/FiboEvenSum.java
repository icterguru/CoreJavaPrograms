package eulerproject;

public class FiboEvenSum {
	public int fibonacciSum(int limit ) 
	{
		int x=0, y=1, z;
		int sum=0;

		while (y<=limit)
		{
			z = x+y;
			x=y;
			y=z;
			if (y%2==0)
				sum+=y;
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		FiboEvenSum	fibo = new FiboEvenSum();
		int result = fibo.fibonacciSum(4000000);
		System.out.println(result);
	}
}
