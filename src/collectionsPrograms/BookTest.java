package collectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class BookTest {

	public static void main(String[] args) 
	{
		ArrayList<ArrayListBook> al=new ArrayList<ArrayListBook>();
		ArrayListBook b1=new ArrayListBook("mahesh", "mindset", "times", 101);
		ArrayListBook b2=new ArrayListBook("babu", "different", "hindu", 102);
		ArrayListBook b3=new ArrayListBook("appala", "thoughts", "indian", 103);
		al.add(b1);
		al.add(b2);
		al.add(b3);
		//System.out.println(al);
		System.out.println("using for-each loop");
		for(ArrayListBook bb:al)
		{
			System.out.println(bb.name+"-------"+bb.publisher+"-----"+bb.author+"-----"+bb.id);
		}
		System.out.println("using iterator");
		Iterator<ArrayListBook> itr=al.iterator();
		while(itr.hasNext())
		{
			ArrayListBook b=(ArrayListBook)itr.next();
			System.out.println(b.author+"------"+b.name+"-------"+b.publisher+"-----"+b.id);
		}
		

	}

}
