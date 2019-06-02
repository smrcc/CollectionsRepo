package collectionsPrograms;

import java.util.Comparator;
import java.util.TreeSet;

public class StringandStringBufferExample {

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new mycomppp());
		t.add("aa");
		t.add("bbb");
		t.add("zzzz");
		t.add(new StringBuffer("cc"));
		t.add(new StringBuffer("dddd"));
		t.add(new StringBuffer("fffff"));
		t.add(new StringBuffer("xxxxxxxxx"));
		System.out.println(t);
		

	}

}
class mycomppp implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		String s1=o1.toString();
		String s2=o2.toString();
		int l1=s1.length();
		int l2=s2.length();
	if(l1<l2)
		return -1;
	else if(l1>l2)
		return 1;
	else return  0;//s1.compareTo(s2);
	
		
	}
	
}