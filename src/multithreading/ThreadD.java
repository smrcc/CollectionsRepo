package multithreading;

public class ThreadD {

	public static void main(String[] args) throws InterruptedException 
	{
		ThreadC c=new ThreadC();
		c.start();
		synchronized(c)
		{
			System.out.println("main thread trying to call wait() method");//1
			c.wait();
			System.out.println("main thread got notification");//4
			System.out.println(c.total);//5
		}
		
		

	}

}
class ThreadC extends Thread
{
	int total=0;
	public void run()
	{
		synchronized(this)
		{
			System.out.println("child thread starts calculation");//2
			for(int i=1;i<=100;i++)
			{
				total=total+i;
			}
			System.out.println("child thread giving notification");//3
			this.notify();
		}
	}
}