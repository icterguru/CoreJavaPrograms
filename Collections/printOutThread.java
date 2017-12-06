package Collections;

public class printOutThread 
{
	public static void main(String[] args) 
	{
		//Thread bt1=new Thread(new baskarThread(), "thread1"));   //use this line when using (implements Runnable)
		baskarThread bt1=new baskarThread("thread1");
		bt1.start();
		System.out.println();
	}

}
