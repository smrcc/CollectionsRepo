package Programmes;

public abstract  class it1 
{
	abstract void m1(int a);
	abstract void m1(int a,int b);
	void m2()
	{
		System.out.println("m2 method");
	}

}
class BB extends it1
{

	@Override
	public void m1(int a) {
		System.out.println("m1 method");
		
	}

	@Override
	public void m1(int a, int b) {
		System.out.println("21 method");
		
	}
	void m3()
	{
		System.out.println("m");
	}
	public static void main(String args[])
	{
		it1 i =new BB();
		i.m1(10);
		i.m1(10, 20);
		i.m2();
		
	}
	
}
