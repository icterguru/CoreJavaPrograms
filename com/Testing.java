package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Testing 
{
	private Quiz quiz = new Quiz();

	public static void main(String[] args) 
	{
		{    new Testing();       
		}
	}

	public Testing() {
		ExecutorService executor = Executors.newCachedThreadPool();

		for (int i = 0; i < 5; i++)    // Create and launch 5 threads
		{                               
			executor.execute(new TakeQuiz());
		}
		executor.shutdown();
		while (!executor.isTerminated()) {  }  // Wait until all tasks are finished
	}

	public class TakeQuiz implements Runnable {
		public void run() {
			quiz.increaseCount(20);
		}
	}

	public static class Quiz {
		private int correctCount;

		public void increaseCount(int times) {
			 correctCount = 0;
			for (int i = 0; i < times; i++) 
			{
				correctCount++;

	// This delay is deliberately added to magnify the data-corruption problem and make it easy to see.
				try {
					Thread.sleep(15);
				}
				catch (InterruptedException ex) {     }
			}
			System.out.println("Count is " + correctCount);
		}
	}    
}

