package collectionsPrograms;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestTreemapBook {

	public static void main(String[] args)
	{
		Treemapbook b=new Treemapbook(20, "how  ", "mahesh");
		Treemapbook b1=new Treemapbook(22, "without ", "babu");
		Treemapbook b2=new Treemapbook(30, "job ", "appala");
		TreeMap<Integer,Treemapbook> m=new TreeMap();
		m.put(3, b2);
		m.put(2, b1);
		m.put(1, b);
		for(Entry<Integer, Treemapbook>  mm:m.entrySet())
		{
			int key=mm.getKey();
			Treemapbook bb=mm.getValue();
			System.out.println(key +" Details:    ");
			System.out.println(bb.id +" " +bb.author +" "+bb.name);
		}
		

	}

}
