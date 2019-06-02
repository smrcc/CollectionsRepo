package multithreading;

public class Test4  extends Thread
{

}
class Demo5 
{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(15);
		Thread.currentThread().setPriority(8);
		Test4 t=new Test4();
		System.out.println(t.getPriority());
	}
}