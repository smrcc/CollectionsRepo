package Programmes;

import java.util.HashSet;
import java.util.Set;

public class MM {

	public static void main(String[] args) 
	{
String str[]= {"mahi","appala","babu","appala","mahi"};
Set<String> st=new HashSet();
for(String ss:str)
{
if(st.add(ss)==false)
{
	System.out.println(ss);
}
}
	
	}

}
