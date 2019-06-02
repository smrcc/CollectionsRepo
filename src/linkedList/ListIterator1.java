package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) 
	{
		LinkedList<String> l=new LinkedList<String>();
		l.add("ibps");
		l.add("sbi");
		l.add("axis");
		l.add("icici");
		l.add(2, "karurvysya");
		System.out.println(l.get(3));
		ListIterator itr=l.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("backward direction");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}

	}

}
