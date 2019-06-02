package collectionsPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapnongeneric {

	public static void main(String[] args)
	{
		Map m=new HashMap();
		m.put(36, "india");
		m.put(108, "andhrapradesh");
		m.put(33, "prakasam");
		m.put(38, "india");
		System.out.println(m);
	    //Traversing Map  
	    Set s=m.entrySet();//Converting to Set so that we can traverse 
	    Iterator itr=s.iterator();
	    while(itr.hasNext())
	    {
	    	 //Converting to Map.Entry so that we can get key and value separately
	    	Map.Entry e=(Map.Entry)itr.next();
	    	System.out.println(e.getValue()+"----"+e.getKey());
	    }
		
	

	}

}
