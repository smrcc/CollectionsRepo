package collectionsPrograms;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) 
	{
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("maheshbabu");
		q.add("chiru");
		q.add("pawan");
		q.add("ramcharan");
		q.add("saidharam");
		String s=q.element();
		System.out.println(s);
		//String sss=q.remove();
		//System.out.println(sss);
		//String str1=q.peek();
		//System.out.println(str1);
		//String s=q.poll();
		//System.out.println(s);
		for(String str:q)
		{
			System.out.println(str);
		}
		
	

	}

}
