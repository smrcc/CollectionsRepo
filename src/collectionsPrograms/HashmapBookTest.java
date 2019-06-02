package collectionsPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapBookTest {

	public static void main(String[] args) 
	{
		
		Map< Integer,HashMapBook> h=new HashMap< Integer,HashMapBook>();
		HashMapBook hs=new HashMapBook(101,"Let us C","Yashwant Kanetkar","BPB",8);
		HashMapBook h1=new HashMapBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		HashMapBook h2=new HashMapBook(103,"Operating System","Galvin","Wiley",6);
		h.put(1,hs);
		h.put(2, h1);
		h.put(3, h2);
		for(Map.Entry<Integer, HashMapBook> m:h.entrySet())
		{
			Integer key=m.getKey();
			HashMapBook i=m.getValue();
			 System.out.println(key+" Details:"); 

		        System.out.println(i.id+" "+i.name+" "+i.author+" "+i.publisher+" "+i.quantity);  
			
			
		}
//		Set s=h.entrySet();
//		Iterator itr=s.iterator();
//		while(itr.hasNext())
//		{
//			Map.Entry e=(Map.Entry)itr.next();
//			System.out.println(e.id+" "+e.name+" "+e.author+" "+e.publisher+" "+e.quantity);
//		}
	
		

	}

}
