package Programmes;

public class Reverse {

	public static void main(String[] args) 
	{
		int num=143;
		int reverse =0;
		int remainder;
		
		while(num!=0)
		{
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
			
		}
		System.out.println("reverse number is:"+ reverse);

	}

}
