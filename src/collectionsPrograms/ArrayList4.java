package collectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList4 {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("mahesh");
		al.add("babu");
		al.add("appala");
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("mahesh");
		al1.add("different");
		al1.add("mindset");
		al1.add("than others");
		al.removeAll(al1);
		System.out.println(al);
		for(String str:al)
		{
			System.out.println(str);
		}
			Iterator<String> itr=al.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		
		

	}

}
