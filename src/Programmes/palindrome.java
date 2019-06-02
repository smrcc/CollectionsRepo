package Programmes;

public class palindrome {

	public static void main(String[] args) 
	{
		int num=12121;
		int r;
		int temp=num;
		int sum=0;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum*10+r;
		}if(temp==sum)
		{
			System.out.println("given number is palindrome");
		}
		else
		{
			System.out.println("given number is not palindrome");
		}
		

	}

}
