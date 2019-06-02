package Programmes;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) 
	{
		int arr[]= {10,20,10,30,45,35,20};
		
		Set<Integer> s=new HashSet<Integer>();
		
		for(Integer i:arr)
		{
			if(s.add(i)==false)
			{	
				System.out.println(i);	
			}
			
		}
	

	}

}
