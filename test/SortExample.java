package test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortExample 
{
	public static void main(String[] args) 
	{

		/*List<String> fruits = new ArrayList<String>();

		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("Plums");

		Collections.sort(fruits);
		int i =0;
		for(String temp:fruits)
		{
			System.out.println("fruits"+ ++i + ":" +temp);
		} */




		String[] fruits = new String[]{"Pinapple", "Apple", "Orange", "Plums", "Banana", "Grapes"};
		Arrays.sort(fruits);
		int i=0;
		for (String temp: fruits)
		{
			System.out.println("fruits"+ ++i + " : " +temp);
		}   

	}
}
