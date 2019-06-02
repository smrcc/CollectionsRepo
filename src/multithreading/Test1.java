package multithreading;

public class Test1 implements Runnable  
{
	public void run()
	{
		System.out.println("run method");
	}

}
class Demo 
{
	public static void main(String[] args) {
		Test1 t=new Test1();
		Thread t1=new Thread(t);
		t1.start();
		t1.run();
	
		
	}
}