package multithreading;

public class MyThread  extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child method");
			//Thread.yield(); if we comment this method we can't say eaxct executing order.
			//child thread always calls yield method because of that main thread will get chance morre number of times and the chance of completing main thread first is high
			//if we comment we can say executing order main thread follewd by child thread
			// 
		}
	}

}
class YieldDemo
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
		
	}
}
