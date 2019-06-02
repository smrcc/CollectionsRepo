package collectionsPrograms;

public class Employee  implements Comparable
{
	String name;
	int id;
	Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public int compareTo(Object o) 
	{
		Employee e=(Employee)o;
		if(id>e.id)
		return 1;
		else if(id<e.id)
		
		return -1;
		else
		return 0;
//		Employee e=(Employee)o; 
//		Employee e1=(Employee)o1; 
//		String s1=e.name;
//		String s2=e1.name;
//		return s1.compareTo(s2);
		
	}

}
