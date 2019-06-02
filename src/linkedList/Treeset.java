package linkedList;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args)
	{
		TreeSet<String> t=new TreeSet<String>();
		t.add("mahesh");
		t.add("babu");
		t.add("appala");
		int i=t.size();
		boolean b=t.contains("india");
		boolean b1=t.equals("Mahesh");
		System.out.println(b1);
		System.out.println(b);
		System.out.println(i);
		System.out.println(t);
		
		for(String str:t)
		{
			System.out.println(str);
		}
		Iterator<String> itr=t.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
