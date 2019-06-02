package strings;

public interface Drawable 
{
	void drawable();
	default void msg()
	{
		System.out.println("good morning");
	}

}
class E implements Drawable
{

	@Override
	public void drawable() 
	{
		System.out.println("concentration on what you are  doing");		
	}
	public static void main(String args[])
	{
		Drawable d=new E();
		d.drawable();
		d.msg();
	}
}