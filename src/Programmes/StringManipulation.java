package Programmes;

public class StringManipulation {

	public static void main(String[] args) 
	{
		String s="Appala Mahesh Babu";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(8));
		
		System.out.println(s.indexOf('a'));
		
		System.out.println(s.indexOf('a',s.indexOf('a')+1));
		
		
		System.out.println(s.indexOf('a',1+s.indexOf('a',1+s.indexOf('a'))));
		
		System.out.println(s.indexOf('a',1+s.indexOf('a',1+s.indexOf('a',1+s.indexOf('a')))));
		
		//split method
		String str="Appala_Mahesh_Babu_";
		String test[]=str.split("_");
		for(String a:test)
		{
			System.out.println(a);
		}
		
		

	}

}
