package Programmes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args)
	{
		String str[]= {"java","ruby","python","pearl","c","java"};
		
		Map <String,Integer> m=new HashMap<String,Integer>();
		
		for(String name:str)
		{
			Integer count=m.get(name);
			if(count==null)
			{
				m.put(name, 1);
			}
			else
			{
				m.put(name, ++count);
			}
		}
	Set<Entry<String,Integer>> entryset=m.entrySet();
	for(Entry<String,Integer>entry:entryset)
	{
		if(entry.getValue()>1)
		{
			System.out.println(entry.getKey());
		}
	}

	}

}
