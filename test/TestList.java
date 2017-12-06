package test;
import java.util.*;
public class TestList 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();

		list.add("red");
		list.add("green");
		list.add("red");
		list.add("green");
		
		System.out.println("list before for loop : " +list);

		String element="red";
		// for(int i=o; i<list.size();i++)
		
		for(int i=list.size()-1; i>=0; i--)
			if (list.get(i).equals(element))
				list.remove(element);

		System.out.println(list);
	}
}
