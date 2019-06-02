package Programmes;

public class DuplicateCharacters1 {

	public static void main(String[] args) 
	{
		int num=116;
		boolean isprime=true;
			
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isprime=false;
				break;
				
			}
		}
if(isprime)
{
	System.out.println("given number is prime number");
}
else 
{
	System.out.println("given number   is   not prime number");
}
	}

}
