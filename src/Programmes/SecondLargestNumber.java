package Programmes;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) 
	{
		int num[]= {10,32,55,86,45,99,91};

		int largest=num[0];

		int secondlargest=num[0];

		for(int i=1;i<num.length;i++)
		{
			if(num[i]>largest)
			{
				secondlargest=largest;
				largest=num[i];
			}
			else if(num[i]>secondlargest)
			{
				secondlargest=num[i];
			}
		}
		System.out.println("Given array numbers is:"+ Arrays.toString(num));
	
 System.out.println(secondlargest);
 System.out.println(largest);
}
}