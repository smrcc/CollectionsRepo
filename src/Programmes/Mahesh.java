package Programmes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Mahesh 
{
	
	public static void main(String[] args) 
	{
int a[]= {32,13,55,98,10,-12,-13,-15};
bubblesort(a);

for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}



	}
	public static void bubblesort(int a[])
	{
		int n=a.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(a[j-1]>a[j])
				{
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		
	}

}