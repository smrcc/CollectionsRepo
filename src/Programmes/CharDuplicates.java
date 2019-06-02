package Programmes;

import java.util.HashSet;
import java.util.Set;

public class CharDuplicates {

	public static void main(String[] args)
	{
		String str="aaaabbbbbccccdddeeaaabbb";
		
		StringBuffer sb=new StringBuffer();
		
		int i=0;
		while(i<str.length())
		{
			if(sb.length()==0) 
		    sb.append(str.charAt(i));
			if(str.charAt(i)==sb.charAt(sb.length()-1))
{
	i++;
}
			 else {
				 sb.append(str.charAt(i)); 
				 i++;
				 }
		}
		System.out.println(sb);
		
		
	

	}

}
