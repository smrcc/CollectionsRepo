package collectionsPrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) 
	{
		 HashMap<Integer,String> hm=new HashMap<Integer,String>();
		    hm.put(116, "mahesh");
			hm.put(112, "babu");
			hm.put(109, "appala");
			hm.remove(112);
			//Collection<String> str=hm.values();
			//System.out.println(str);
			String s=hm.remove(101);
			System.out.println(s);
			for(Map.Entry m:hm.entrySet())
			{
				System.out.println(m.getValue()+"-----"+m.getKey());
			}
		

	}

}
