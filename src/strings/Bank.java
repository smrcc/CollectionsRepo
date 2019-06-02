package strings;

public interface Bank 
{
float rateofIntrest();
}
class indian implements Bank
{

	@Override
	public float rateofIntrest() {
		System.out.println("that is my opinion");
		System.out.println("ROI :+ rateof intrest is 7.5");
		return 7.5f;
	}
	
}
class uco extends indian
{
	public float rateofIntrest()
	{
		System.out.println("i am not looser");
		System.out.println("ROI :+ rateof intrest is 9.5");
		return 8.5f;
		
	}
	public static void main(String args[])
	{
		Bank b=new uco();
		b.rateofIntrest();
		Bank bb=new indian();
		bb.rateofIntrest();
		
	}
}