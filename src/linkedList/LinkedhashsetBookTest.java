package linkedList;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashsetBookTest {

	public static void main(String[] args) 
	{
		LinkedHashSet<linkedhashsetBook> h=new LinkedHashSet<linkedhashsetBook>();
		linkedhashsetBook lh=new linkedhashsetBook("be positive", "mahesh", 36);
		linkedhashsetBook lh1=new linkedhashsetBook("during", "babu", 436);
		linkedhashsetBook lh2=new linkedhashsetBook("tough times in your life", "appala", 4365);
		h.add(lh);
		h.add(lh1);
		h.add(lh2);
		for(linkedhashsetBook s:h)
		{
			System.out.println(s.name+"------"+s.author+"------"+s.id);
		}
		Iterator<linkedhashsetBook> itr=h.iterator();
		while(itr.hasNext())
		{
			linkedhashsetBook l=(linkedhashsetBook)itr.next();
			System.out.println(l.name+"------"+l.author+"------"+l.id);
		}
		

	}

}
