package exceptions;

public class Testpropagation 
{
	void m1()
	{
		int a=50/0;
	}
	void n()
	{
		m1();
	}
	void p()
	{
		
		try {
			n();
		}catch(ArithmeticException e)
		{
			System.out.println("excption handled");
		}
	}

}
class Testpropagationmain
{
	public static void main(String[] args) 
	{
		Testpropagation t=new Testpropagation();
		t.p();
		System.out.println("rest of the code");
		
	}
}
