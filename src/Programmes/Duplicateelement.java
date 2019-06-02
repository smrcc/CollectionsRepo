package Programmes;

import java.util.HashSet;
import java.util.Set;

public class Duplicateelement {

	public static void main(String[] args) 
	{
		String names[]= {"java","python","ruby","perl","c","java"};
		
		Set <String> store=new HashSet<String>();
		
		for(String name:names)
		{
			if(store.add(name)==false)
			{
				System.out.println(name);
			}
		}
		

	}

}
