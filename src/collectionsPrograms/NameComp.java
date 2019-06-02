package collectionsPrograms;

import java.util.Comparator;

public class NameComp implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		Employee e=(Employee)o1;
		Employee ee=(Employee)o2;
		
		String s1=e.name;
		String s2=ee.name;
		return s1.compareTo(s2);
	
	}
	


	

}
