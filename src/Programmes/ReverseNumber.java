package Programmes;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a number to reverse");
		
		int original=s.nextInt();
		
		int reverse=0;
		
		int remainder;
		
		while(original!=0)
		{
			remainder=original%10;
			reverse=reverse*10+remainder;
			original=original/10;
		}
		System.out.println(reverse);
	
	}

}
