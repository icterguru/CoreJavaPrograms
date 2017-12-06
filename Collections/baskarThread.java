package Collections;

public class baskarThread extends Thread
{
	Thread printer;
	public baskarThread()
	{
	}
	public baskarThread(String threadName) 
	{
		printer=new Thread(this, threadName);
		System.out.println(printer.getName());
		printer.start();
	}
	public void run() 
	{
		System.out.println(Thread.currentThread());
	}
}



