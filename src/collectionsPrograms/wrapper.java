package collectionsPrograms;

public class wrapper {

	public static void main(String[] args)
	{
		Integer i=new Integer(100);
		System.out.println(i);
		
		Integer i1=new Integer("100");
		System.out.println(i1);
		
		Integer i2=new Integer("one");  //NPE
		System.out.println(i2);

	}

}
