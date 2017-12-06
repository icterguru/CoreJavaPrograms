package eulerproject;

public class SumSquareDifference 
{
	public long sumSquareDiff(int end)
	{
		int sum_squares =0;
		int squares_sum =0;
		int sum =0;

		for (int i=1; i<=end; i++)
		{
			sum_squares += i*i;
		}

		for (int i=1; i<=end; i++)
		{
			sum += i;
			squares_sum = sum * sum;
		}
		long sumSquareDifference = squares_sum - sum_squares;
		System.out.println(sumSquareDifference);
		return sumSquareDifference;
	}
	public static void main(String[] args) 
	{
       SumSquareDifference SSD = new SumSquareDifference();
       SSD.sumSquareDiff(10);
       SSD.sumSquareDiff(100);

	}

}
