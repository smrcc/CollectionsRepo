package linkedList;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestBook {

	public static void main(String[] args) 
	{
		ArrayList<listIterator> al=new ArrayList<listIterator>();
		listIterator i=new listIterator("welcome", "mahesh", "own", 1, 30);
		listIterator i1=new listIterator("new", "babu", "other", 2, 31);
		listIterator i2=new listIterator("world", "appala", "indian", 3, 32);
		al.add(i);
		al.add(i1);
		al.add(i2);
		ListIterator itr=al.listIterator();
		while(itr.hasNext())
		{
			listIterator s=(listIterator)itr.next();
			System.out.println(s.name+"-----"+s.author+"------"+s.publisher+"-----"+s.id+"-----"+s.age);
		}
		System.out.println("backward direction");
		while(itr.hasPrevious())
		{
			listIterator s=(listIterator)itr.previous();
			System.out.println(s.name+"-----"+s.author+"------"+s.publisher+"-----"+s.id+"-----"+s.age);
		}
		for(listIterator st:al)
		{
			System.out.println(st.name+"-----"+st.author+"------"+st.publisher+"-----"+st.id+"-----"+st.age);
		}

	}

}
