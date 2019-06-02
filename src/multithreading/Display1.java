package multithreading;

public class Display1 
{
	public synchronized  void wish(String name)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Good Night:");
			try
			{
				Thread.sleep(2000);
			}catch(InterruptedException ie)
			{
				
			}System.out.println(name);
		}
	}

}
class MyThread4 extends Thread
{
	Display1 d;
	String name;
	MyThread4(Display1 d,String name)
	{
		this.name=name;
		this.d=d;
	}
	public void run()
	{
		d.wish(name);
	}
}
class SynchronizedDemo
{
	public static void main(String[] args) {
		
	
	Display1 d=new Display1();
	MyThread4 t=new MyThread4(d, "mahesh babu");
	MyThread4 t1=new MyThread4(d, "ToEveryOne");
	t.start();
	t1.start();
	
	
}}