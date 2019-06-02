package linkedList;

import java.util.ArrayList;

public class List {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("india");
		al.add("andhrapradesh");
		al.add("prakasam");
		al.add("naguluppapalapadu");
		al.add(1,"cheervanuppalapadu");
		System.out.println(al);
		System.out.println(al.get(3));
		for(String l:al)
		{
			System.out.println(l);
		}
		

	}

}
