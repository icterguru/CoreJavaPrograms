package test;

public class TesterD 
{
	public static void main(String[] args) 
	{
		int i = 0;
		for (i = 0; i <= 10; i++)
		{
			System.out.print((i + 4)+" ");	
		}

		System.out.println(" ");

		//int i = 0;
		for (i = 0; i <= 10; i++);

		System.out.print((i + 4)+" ");	
	}

}
