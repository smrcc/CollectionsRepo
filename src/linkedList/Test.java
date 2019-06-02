package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) 
	{
		LinkedList<String> l=new LinkedList<String>();
		l.add("mahesh");
		l.add("babu");
		l.add("appala");
		System.out.println(l);
		for(String t:l)
		{
			System.out.println(t);
		}
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
