package arrays;

public class Even {

	public static void main(String[] args) 
	{
		String [] s=new String[7];
		s[0]="aaa";
		s[1]="bbb";
		s[2]="ccc";
		s[3]="ddd";
		s[4]="eee";
	for(Object o:s)
	{
		if(o instanceof String)
		{
			String ss=(String)o;
			System.out.println(ss);
		}
		if(o==null)
		{
			System.out.println(o);
		}
	}
		
		
		

	}

}
