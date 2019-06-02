package collectionsPrograms;

import java.util.Comparator;
import java.util.TreeSet;

public class DescendingorderInteger {

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new mycomp());
		t.add(10);
		t.add(5);
		t.add(8);
		t.add(13);
		t.add(15);
		t.add(10);
		System.out.println(t);
	

	}

}
class mycomp implements Comparator
{


//	public int compare(Integer i1, Integer i2) {
//		if(i1<i2)
//			return -1;
//		else if(i1<i2)
//			return 1;
//		else return 0;
//		
//	}

	@Override
	public int compare(Object o1, Object o2) 
	{
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
//		if(i1<i2)
//			return 1;
//		else if(i1>i2)
//			return -1;
//		else 
//	
//		return 0;
		//return  i1.compareTo(i2); default natural sorting order i.e increasing
		//return  -i1.compareTo(i2); //customized sorting order .ie decreasing
	return  i2.compareTo(i1);//decreaing
		//return  -i2.compareTo(i1);
	}
	
}