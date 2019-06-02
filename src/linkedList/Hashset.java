package linkedList;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) 
	{
		HashSet<String> h=new HashSet<String>();
		h.add("india");
		h.add("southafrica");
		h.add("england");
		h.add("westindies");
		h.add("newzealand");
		boolean b=h.isEmpty();
		System.out.println(b);
		boolean b1=h.contains("india");
		System.out.println(b1);
		int i=h.size();
		System.out.println(i);
		//h.clear();
		h.clone();
		for(String str:h)
		{
			System.out.println(str);
		}
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
