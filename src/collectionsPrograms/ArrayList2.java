package collectionsPrograms;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("mahesh");
		al.add("babu");
		al.add("appala");
		al.add("different");
		al.add("mahesh");
		System.out.println(al);
		for(String st:al)       //for each loop
		{
			System.out.println(st);
		}
		

	}

}
