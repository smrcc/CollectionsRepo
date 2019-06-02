package linkedList;

import java.util.Iterator;
import java.util.TreeSet;

public class TestBookTreeSet {

	public static void main(String[] args) 
	{
		TreeSetBook t=new TreeSetBook("Difficult Times", "Mahesh", 13, 230);
		TreeSetBook t1=new TreeSetBook("inlife", "babu", 12, 130);
		TreeSetBook t2=new TreeSetBook("common", "appala", 11, 140);
		TreeSet<TreeSetBook> s=new TreeSet<TreeSetBook>();
		s.add(t);
		s.add(t1);
		s.add(t2);
		for(TreeSetBook ss:s)
		{
			System.out.println(ss.name+"-----"+ss.author+"-----"+ss.id+"-----"+ss.age);
		}
		System.out.println("after iterator");
		Iterator<TreeSetBook> itr=s.iterator();
		while(itr.hasNext())
		{
			TreeSetBook sss=(TreeSetBook)itr.next();
			System.out.println(sss.age+"------"+sss.author+"------"+sss.name+"-----"+sss.id);
		}
	

	}

}
