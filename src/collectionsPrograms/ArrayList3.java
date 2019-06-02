package collectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("mahesh");
		al.add("babu");
		al.add("appala");
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("mindset");
		al1.add("different");
		al1.add("than ohers");
		al.addAll(al1);
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			for(String st:al)
			{
				System.out.println(st);
			}
	}

}
