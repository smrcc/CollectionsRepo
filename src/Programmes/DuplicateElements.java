package Programmes;

public class DuplicateElements {

	public static void main(String[] args) 
	{
		
		String names[]= {"java","c","ruby","python","c++","java","c"};
		
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println(names[i]);
				}
			}
		}
	

	}

}
