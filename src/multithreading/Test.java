package multithreading;

public class Test extends Thread 
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
	}

}
class DemoTest
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
		System.out.println("rest of the code");
		
	}
}