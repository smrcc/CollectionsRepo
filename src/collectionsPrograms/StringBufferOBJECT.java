package collectionsPrograms;

import java.util.Comparator;
import java.util.TreeSet;

public class StringBufferOBJECT {

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new mycompp());
		t.add(new StringBuffer("X"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("M"));
		t.add(new StringBuffer("z"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		System.out.println(t);	
	}

}
class mycompp implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
	String s1=o1.toString();
	String s2=o2.toString();
	
		return s1.compareTo(s2);
	}
	
}