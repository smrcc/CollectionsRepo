package Programmes;

import java.util.Arrays;

public class LargestandSmallestNumbers {

	public static void main(String[] args) 
	{
		int numbers[]= {10,25,35,88,-89,-7,-1};
		
		int largest=numbers[0];
		
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
			{
				largest=numbers[i];
			}
			else if(numbers[i]<smallest)
			{
				smallest=numbers[i];
			}
			
		}System.out.println("given array is: " + Arrays.toString(numbers));
		
		System.out.println("Largest number is:"  + largest);
		
		System.out.println("Smallest number is:"+ smallest);
		
		
		

	}

}
