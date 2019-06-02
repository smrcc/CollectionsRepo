package multithreading;

public class Display2
{
	public synchronized void displayn()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000);
			}catch(InterruptedException ie)
			{

			}
		}
	}
	public synchronized  void displayc()
	{
		for(int i=65;i<70;i++)
		{
			System.out.println((char)i);
			try
			{
				Thread.sleep(2000);
			}catch(InterruptedException ie)
			{
				
			}
		}
	}

}

class MyThread6 extends Thread
{
	Display2 d;
	MyThread6(Display2 d)
	{
		this.d=d;
	}
	public void run()
	{
		d.displayn();
	}
}
class MyThread7 extends Thread
{
	Display2 d;
	MyThread7(Display2 d)
	{
		this.d=d;
	}
	public void run()
	{
		d.displayc();
	}
}
class SynchronizedDemo3
{
	public static void main(String[] args) 
	{
		Display2 d=new Display2();
		MyThread6 t=new MyThread6(d);
		MyThread7 t1=new MyThread7(d);
		t.start();
		t1.start();
		
	}
}
