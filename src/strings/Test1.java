package strings;

public class Test1 {

	public static void main(String[] args) 
	{
		String s="mahesh";  //strings are immutable 
		s.concat("babu");
		System.out.println(s);
		StringBuffer sb=new StringBuffer("appala");//stringbuffer are mutable
		sb.append("maheshbabu");
		System.out.println(sb);
		

	}

}
