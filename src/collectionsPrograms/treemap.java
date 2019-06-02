package collectionsPrograms;

import java.util.Map;
import java.util.TreeMap;

public class treemap {

	public static void main(String[] args)
	{
		TreeMap<Integer,String> m=new TreeMap();
		m.put(11, "mahesh");
		m.put(36, "babu");
		m.put(100, "appala");
		m.put(300, "maheshbabu");
		System.out.println(m);
		m.remove(36);
		for(Map.Entry<Integer, String > tm:m.entrySet())
		{
			System.out.println(tm.getKey()+"   "+tm.getValue());
		}
		

	}

}
