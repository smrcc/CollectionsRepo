package arrays;

public abstract class Hero 
{
	abstract void heroMethod();
	public void m1()
	{
		System.out.println("m1 method");
	}

}
class Heroine extends Hero 
{

	@Override
	void heroMethod() {
		System.out.println("very beautiful girl");
		
	}
	public static void main(String[] args) {
		Hero h=new Heroine();
		h.heroMethod();
		h.m1();
	}
	
}