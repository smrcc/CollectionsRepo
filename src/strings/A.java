package strings;

public interface A 
{
	void a();
	void b();
	void c();
	void d();
	void e();

}
abstract class B implements A
{
  public void a()
  {
	  System.out.println("Hi iam a");
  }
}
 class C extends B
{
	public void b()
	{
		System.out.println("Hello iam b");
	}
	
	public void c()
	{
		System.out.println("Hello iam c");
	}
	public void d()
	{
		System.out.println("Hello iam d");
	}
	public void e()
	{
		System.out.println("Hello iam e");
	}
	public static void main(String args[])
	{
		A aa=new C();
		aa.a();
		aa.b();
		aa.c();
		aa.d();
		aa.e();
	}
}