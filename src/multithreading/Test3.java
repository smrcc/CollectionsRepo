package multithreading;

public class Test3  extends Thread
{
	public void run()
	{
		System.out.println("Run method is executed by Thread:"+Thread.currentThread().getName());
	}

}
class Demo4
{
	public static void main(String[] args) 
	{
		Test3 t=new Test3();
		t.start();
		System.out.println("Main method executed by Thread:"+Thread.currentThread().getName());
		
	}
}
