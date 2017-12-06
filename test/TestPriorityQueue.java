package test;
import java.util.*;
public class TestPriorityQueue 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Arrays.asList(60,10,50,30,40,20));

		for(int i: queue)
			System.out.print(i + " ");
		
	//	while(!queue.isEmpty())
		//	System.out.print(queue.poll()+" ");
	}

}
