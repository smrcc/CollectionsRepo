package exceptions;

public class Testthrow1 
{
	                         //Throw keyword is used to explicitly throw an exception.
	                         //We can throw  either checked or unchecked exception in java by throw keyword.
	                         //Throw keyword mainly used for custom exceptions
	static void m1(int age)
	{
		if(age<18)
		
			  throw new ArithmeticException("not valid"); 
		
		else
		
			System.out.println("Eligible for vote");
		
	}

}
class Testmain
{
	public static void main(String[] args) 
	{
		Testthrow1 .m1(17);
		System.out.println("rest of the code");
		
	}
}
