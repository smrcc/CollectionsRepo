package Programmes;

import java.util.HashSet;
import java.util.Set;

public class DuplicateMahesh {

	public static void main(String[] args) 
	{
		String[] str= {"Mahesh","ckanth","Chandrarao","Chenchulakshmi","Rajasekhar","swathi","ckanth","Mahesh"};
		
		Set<String> s=new HashSet<String>();
		
		for(String ss:str)
		{
			if(s.add(ss)==false)
			{
				System.out.println(ss);
			}
		}
		

	}

}
