package multithreading;

public class Display 
{
	public void wish(String name)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Good Morning:");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
			System.out.println(name);
		}
	}

}
class MyThread5 extends Thread
{
	Display d;
	String name;
	MyThread5(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class NonsynchronizedDemo
{
	public static void main(String[] args) 
	{
		Display d=new Display();
		MyThread5 t=new MyThread5(d, "mahesh babu");
		MyThread5 t1=new MyThread5(d, "appala mahesh babu");
		t.start();
		t1.start();
		
	}
}