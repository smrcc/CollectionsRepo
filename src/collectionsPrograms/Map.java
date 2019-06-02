package collectionsPrograms;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> m=new HashMap();
		m.put(101, "mahi");
		m.put(102, "appala");
		m.put(103, "babu");
		System.out.println(m);
		System.out.println(m.put(104, "babu"));
		

	}

}
