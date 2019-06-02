package strings;

public  abstract class Bike 
{
	Bike()
	{
		System.out.println("bike is created");
	}
	abstract void run();
	void pulserbike()
	{
		System.out.println("pulsar bike");
	}

}
class Fz extends Bike
{

	@Override
	void run() 
	{
		System.out.println("new bike while driving must and should wear helmet");
	
		
	}
	public static void main(String args[])
	{
		Bike b=new Fz();
		b.pulserbike();
		b.run();
	}
	
}
