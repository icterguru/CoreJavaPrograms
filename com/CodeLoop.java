package com;

public class CodeLoop {

	public static void main(String[] args) {
		int j=1;
		while (j<1000)
		{
			if (j%42==0)
			{
				System.out.print(j+" ");
			}
			j++;
		}
	}
}
