package Programmes;

public class Armstrongnumber {

	public static void main(String[] args) 
	{
		int num=153; //1*1*1+5*5*5+3*3*3=1+125+27=153
		int temp=num;
		int r;
		int sum=0;
		while(num>0) 
		{
			r=num%10;
			num=num/10;
			sum=sum+r*r*r;

		}
			if(temp==sum)
			{
				System.out.println(    "  given number is an armstrong number" );
			}
			
			else
			{
				System.out.println(" given number is not an armstrong number");
			}

	}

}
