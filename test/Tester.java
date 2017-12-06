package test;

public class Tester 
{
	public static void main(String[] args)
	{

		 double sum =0;
	    for (int i = 1; i <= 99; i++)
		{
			//sum += 1.0 * i / (i + 1);
			sum += i / (i + 1.0);
			//sum = i / (i+1);
		} 
		System.out.println("Sum is " + sum); 



		/* int sum = 1; 
		for (int i = 0; i<10; i++)
		{
			System.out.print((sum += i)+" ");
		}	*/



		/*	for (int i = 1; i <= 20; i++) 
		{
			System.out.print(i + " ");
			++i;     
		} */


			/*for (int i = 0; i < 5; i++)

			for (int j = 0; j < i; j++)

				System.out.print(i*j +" ");*/
	}
}








