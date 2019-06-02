package Programmes;

public class PrimeNumber1 {

	public static void main(String[] args) 
	{
		int num=116;
		boolean isprime=true;
		
		
		for(int i=2;i<num;i++)  //for(int i=2;i<num/2;i++)  for(int i=2;i<Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				isprime=false;
				break;
			}
			
		}
		if(isprime) {
		
			System.out.println(num  +" given number is prime number");
		}
		else
		{
			System.out.println(num + " not prime number");
		}
	}
}

