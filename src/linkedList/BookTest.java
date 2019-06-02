package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class BookTest {

	public static void main(String[] args) {
		LinkedList<Book> l=new LinkedList<Book>();
		Book b1=new Book("BePositive", "mahesh", "unknown", 56);
		Book b2=new Book("LateMechanism", "maheshbabu", "Hindu", 560);
		Book b3=new Book("Implementation", "maheshbabu appala", "TOI", 456);
		l.add(b1);
		l.add(b2);
		l.add(b3);
		for(Book bb:l)
		{
			System.out.println(bb.name+"-----"+bb.author+"------"+bb.publisher+"----"+bb.id);
		}
		Iterator<Book> itr=l.iterator();
		while(itr.hasNext())
		{
			Book b=(Book)itr.next();
			System.out.println(b.name+"-----"+b.author+"-----"+b.publisher+"-----"+b.id);
			int itr1=l.size();
			System.out.println(itr1);
		}
		

	}
	
	
}
