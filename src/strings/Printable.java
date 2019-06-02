package strings;

public interface Printable 
{
	void printable();

}
interface showable
{
	void showable();
	
}
class D implements Printable,showable
{

	@Override
	public void showable() {
	System.out.println("welcome to java");
		
	}

	@Override
	public void printable() {
		System.out.println("try to improve coding skills");
		
	}
	public static void main(String args[])
	{
		D d=new D();
	
		d.showable();
		d.printable();
	}
	
}
