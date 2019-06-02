package collectionsPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args)
	{
		Map<Integer,String> m=new HashMap();
		m.put(106, "mahesh");
		m.put(102, "babu");
		m.put(108, "appala");
		System.out.println(m);
		for(Map.Entry mm:m.entrySet())
		{
			System.out.println(mm.getKey()+"----"+mm.getValue());
		}
//		Iterator itr=((Set<Entry<Integer, String>>) m).iterator(); CCE
//		while(itr.hasNext())
//		{
//			System.out.println(itr);
//		}
		}
		

	}


