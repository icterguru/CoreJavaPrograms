package eulerproject;

public class MultiplesOf3Or5 {
	int  count =0;
	public int multiplesOf3R5(int limit)
	{
		int sum = 0; 
		for (int j=0; j<=limit; j++)
		{
			if (j%3==0 || j%5==0)
			{
				sum += j;
				count++;
			}
		}
		return sum;
		//System.out.println(count);

	}
	public static void main(String[] args) {
		MultiplesOf3Or5 mult = new MultiplesOf3Or5();
		int result = mult.multiplesOf3R5(10);
		System.out.println(result);
		System.out.println(mult.count);
	}
}



/*public int multipleOf(int multiple, int endNumber)
	{
		int n= endNumber/multiple;
		int sum = (n*(n+1))/2 * multiple;
		return sum;
	}*/





