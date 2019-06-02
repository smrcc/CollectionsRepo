package linkedList;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashset {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> h=new LinkedHashSet<String>();
		h.add("mahesh");
		h.add("babu");
		h.add("appala");
		h.add("mahesh");
		for(String str:h)
		{
			System.out.println(str);
			//System.out.println(h);
		}
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
