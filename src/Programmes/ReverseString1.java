package Programmes;

public class ReverseString1 {

	public static void main(String[] args)
	{
		String str="India Is My Country";
		
		int l=str.length();
		
		String reverse="";
		
		for(int i=l-1;i>=0;i--) 
		{
		reverse=reverse+str.charAt(i);
		}
        System.out.println(reverse);
        
        
        //2nd approach
        StringBuffer sb=new StringBuffer(str);
        
       // System.out.println(sb.reverse());
	}
 
}
