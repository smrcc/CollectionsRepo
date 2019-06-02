package multithreading;

public class MyThread1 extends Thread
{
public void run()
{
	for(int i=0;i<10;i++)
	{
		System.out.println("Appala Mahesh");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie)
		{
			
		}
	}
}
}
class joinDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread1 t=new MyThread1();
		t.start();
		t.join();
		//t.join(10000); wait until up to 10000sec
		//if we comment this method we can't say exact executing order
		//if we comment this method we will say after completion of child thread execution (appla mahesh) then only main method executes
		for(int i=0;i<10;i++)
		{
			System.out.println("Appala Mahesh Babu");
		}
		
	}
}
