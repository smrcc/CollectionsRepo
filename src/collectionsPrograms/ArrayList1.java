package collectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("mahesh");
		al.add("babu");
		al.add("appala");
		al.add("different");
		al.add("mahesh");
		System.out.println(al);
		Iterator<String> itr=al.iterator();  //traversing list through iterator
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}//There are two ways to traverse collection elements 1.Iterator interface 2.for-each loop

}
