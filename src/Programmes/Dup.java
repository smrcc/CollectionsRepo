package Programmes;

public class Dup {

	public static void main(String[] args)
	{
		String str[]= {"java","ruby","python","c","c++","java","c"};
		
		for(int i=0;i<str.length-1;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					System.out.println(str[i]);
				}
			}
		}
		

	}

}
