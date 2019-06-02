package collectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList5 {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("mahesh");
		al.add("babu");

		al.add("appala");
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("mahesh");
		al1.add("mindset");
		al.add("ohers");
		al.retainAll(al1);
		System.out.println(al);
		for(String st:al)
		{
			System.out.println(st);
		}
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
