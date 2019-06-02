package collectionsPrograms;

import java.util.Comparator;
import java.util.TreeSet;

public class Reverse {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>(new mycomparator());
		t.add("mahesh");
		t.add("babu");
		t.add("appala");
		t.add("india");
		t.add("andhrapradesh");
		t.add("cheervanuppalapadu");
		t.add("mahesh");
		System.out.println(t);


	}

}
class mycomparator implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();//String s1=(String)o1;
		String s2=o2.toString();//String s2=(String)o2;
		return s2.compareTo(s1);
	}

}