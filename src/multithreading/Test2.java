package multithreading;

public class Test2 extends Thread
{
	public void run()
	{
		System.out.println("child method");
	}

}
class Demo1
{
	public static void main(String[] args) 
	{
		Test2 t=new Test2();
		Thread t1=new Thread(t);
		t1.start();
		System.out.println("main method");
		
	}
}