package collectionsPrograms;

import java.util.TreeSet;

public class EmpComp {

	public static void main(String[] args)
	{
		Employee e1=new Employee("mahesh", 436);
		Employee e2=new Employee("babu", 36);
		Employee e3=new Employee("appala", 136);
		Employee e4=new Employee("india", 236);
		TreeSet<Employee> t=new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);		for(Employee al:t)
		{
			System.out.println(al.id+"-----"+al.name);
		}
		
		

	}

}
