package multithreading;

public class Test5 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
	}

}
class ThreadPriorities
{
	public static void main(String[] args) {
		Test5 t=new Test5();
		t.setPriority(10);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}
}