package linkedList;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashBook {

	public static void main(String[] args)
	{
		HashSet<HashSetBook> h=new HashSet<HashSetBook>();
		HashSetBook  H=new HashSetBook ("let't think","mahesh", 10);
		HashSetBook  H1=new HashSetBook ("about","babu", 101);
		HashSetBook  H2=new HashSetBook ("present","appala", 110);
		h.add(H);
		h.add(H1);
		h.add(H2);
		for(HashSetBook t:h)
		{
			System.out.println(t.name+"------"+t.author+"------"+t.id);
		}
Iterator<HashSetBook> itr=h.iterator();
while(itr.hasNext())
{
	HashSetBook v=(HashSetBook)itr.next();
	System.out.println(v.name+"------"+v.author+"------"+v.id);
}

	}

}
