package test;

import java.util.Arrays;

public class TestClass 
{
	public static void main(String[] args) 
	{
		int[] oldList = {1, 2, 3, 4, 5};
		int[] newList = reverse(oldList);
	
		System.out.println("Original Array: " + Arrays.toString(oldList)); 
		System.out.println("Reverse Array: " +  Arrays.toString(newList));
	}

	public static int[] reverse(int[] list) {
		int[] newList = new int[list.length];

		for (int i = 0; i < list.length ; i++)
		{
			newList[i] = list[list.length - i - 1];
		}
		return newList;
	}
} 

