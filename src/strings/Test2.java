package strings;

public class Test2 
{
	Test2(String str)
	{
		
	}

	public static void main(String[] args) 
	{
		//object class reference comparison
		
		Test2 t=new Test2("appala");
		Test2 t1=new Test2("appala");
		System.out.println(t1.equals(t));
		//string class content comparison
		String s1="mahesh";
		String s2="mahesh";
		System.out.println(s1.equals(s2));
		//stringbuffer class not overriding it uses object class equal()---reference comp
		StringBuffer sb=new StringBuffer("babu");
		StringBuffer sb1=new StringBuffer("babu");
		System.out.println(sb.equals(sb1));
		

	}

}
