package arrays;

public class Final 
{
	static void m1()
	{
		System.out.println("m1 method");
	}
	void m1(int a)
	{
		System.out.println("overloaded method");
	}

}
class mahesh extends Final
{
	
	public static void main(String args[])
	{
		mahesh m=new mahesh();
		m.m1();
		m.m1(10);
		
	}
}