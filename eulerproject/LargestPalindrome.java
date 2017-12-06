package eulerproject;

public class LargestPalindrome 
{
	public static void main(String[] args) 
	{
		int product=0;
		int max=0;
		for(int i=100; i<=999; i++)
		{
			for(int j=100; j<=999; j++)
			{
				product = i*j;
				if(isPalindrome(product)&& product>max)
				{
					max=product;
				}
			}
		}
		System.out.println(max);
	}
	public static boolean isPalindrome(int n)
	{
		StringBuilder s = new StringBuilder(String.valueOf(n));
		return s.toString().equals(s.reverse().toString());
	}
}
