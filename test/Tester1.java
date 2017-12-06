package test;

public class Tester1 
{
	public static void main(String[] args) 
	{
		int val=0;
		while (val<10)
		{
			val=val+1;
			if (val==4)
			{
				continue;     //skips the step
			}
			if (val>5)
			{
				break;
			}
			System.out.print(val+" ");
		}
	}
}
