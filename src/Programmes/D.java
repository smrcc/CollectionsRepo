package Programmes;

import java.util.HashSet;
import java.util.Set;

public class D {

	public static void main(String[] args) 
	{
		int str[]= {1,2,3,4,5,3};
		int l=str[0];
		int s=str[0];
		for(int i=1;i<str.length;i++)
		{
			if(str[i]>l)
			{
				s=l;
				l=str[i];
			}
			else if (str[i]>s)
			{
				s=str[i];
			}
		}
		System.out.println(l);
		System.out.println(s);
		

}
}