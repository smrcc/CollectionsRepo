package strings;

public class Test3 {

	public static void main(String[] args) 
	{
		
		//conversion of string to stringbuffer
		String s="mahesh";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
		
		//conversion of stringbuffer to string
		StringBuffer sb1=new StringBuffer("babu");
		String ss=sb1.toString();
		System.out.println(ss);
		
		

	}

}
