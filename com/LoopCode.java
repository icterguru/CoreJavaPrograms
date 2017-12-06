package com;
public class LoopCode 
{
	public static void main(String[] args) 
	{
		/* ***************************
		int i=0;
		while (i<1000)
		{
			if (i%42==0)
			{
				System.out.print(i+" ");
			}
		i++;
		}
		 ********************************** */	
		
	/*	   int j=1, i=1;
		while (j<300)
		{
			while (i<j)
			{
				if (i%42==0)
				{
					System.out.print(i+" ");
				}
				i++;
			}
			//System.out.println();
			j=j+42; 
		}  */


		/*  for(int j=0;j<4;j++)
		{
			for (int i = 1; i <11 ; i++)
			{
				System.out.print(i+ " ");	
			}	
			System.out.println(); 
		} */


			for( int j=1; j<15; j++)
		{
			for (int i = 1; i<j ; i++)
			{
				System.out.print("*");	
			}	
			System.out.println();
		}
	} 

}
