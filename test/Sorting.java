package test;

import java.util.Arrays;

public class Sorting 
{
	public static void main(String[] args) 
	{
		
		// put the list of fruits in String Array and sort
		
		String[] fruits = new String[]{"Grapes", "Pineapple", "Orange", "Apple", "Banana", "Plums", "Prunes"};
		Arrays.sort(fruits); 
		int i=0;  
		for(String temp: fruits)
		{
			System.out.println("fruits"+ ++i + " : " +temp);
		}

		/*
		 //put the list of fruits in ArrayList class & sort using collections.sort
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Grapes");
		fruits.add("Orange");
		fruits.add("Plums");
		fruits.add("Prunes");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pineapple");
		Collections.sort(fruits);
   		System.out.println(fruits);
		System.out.println(fruits.size());*/
	}
}