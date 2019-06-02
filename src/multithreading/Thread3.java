package multithreading;

public class Thread3  extends Thread
{
	

}
class Demo2
{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread3 t=new Thread3();
		System.out.println(t.getName());
		Thread.currentThread().setName("Mahesh Babu");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
	}

}
