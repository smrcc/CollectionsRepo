package collectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList();
		al.add(Integer.valueOf(100));
		al.add(Integer.valueOf(300));
		al.add(Integer.valueOf(150));//internally will be converted into objects as Integer.valueOf(150) 
		System.out.println(al);
		for(Integer i:al)
		{
			System.out.println(i);
		}
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
