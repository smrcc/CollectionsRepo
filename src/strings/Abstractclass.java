package strings;

public  abstract class Abstractclass
{
	abstract void rateofIntrest();

}
class sbi extends Abstractclass
{

	@Override
	void rateofIntrest() {
		System.out.println("rate of intrest is:   +7");
		
	}
	
}
class  pnb extends Abstractclass
{
	void rateofIntrest()
	{
		System.out.println("rate of intrest is:   +5");
	}
}class obc extends Abstractclass
{
	void rateofIntrest() {
		System.out.println("rate of intrest is:   +8");
	}
	
	public static void main(String args[])
	{
		Abstractclass o=new obc();
		o.rateofIntrest();
		Abstractclass o1=new pnb();
		o1.rateofIntrest();
		sbi i=new sbi();
		i.rateofIntrest();
	}
}