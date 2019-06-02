package Programmes;

import java.util.HashMap;
import java.util.Map;

public class StringNumberOfOccurances {

	public static void main(String[] args) 
	{
		String str="maheshbabu";
		Map<Character,Integer> count=new HashMap<Character,Integer>();
		for(Character cc:str.toCharArray())
		{
			if(count.containsKey(cc))
			{
				count.put(cc, count.get(cc)+1);
			}
				
				else
				{
					count.put(cc, 1);
				}
			
				}System.out.println(count);
		
				}
			}
		
	

	


