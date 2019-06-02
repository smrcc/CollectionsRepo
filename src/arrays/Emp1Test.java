package arrays;

public class Emp1Test {

	public static void main(String[] args) 
	{
		Employee e11=new Employee("india", 10);
		Employee e22=new Employee("andhrapradesh", 100);
		Employee e33=new Employee("prakasam", 8);
		Employee [] e1=new Employee[5];
		e1[0]=e11;
		e1[2]=e22;
		e1[4]=e33;
		for(Object o:e1)
		{
		if( o instanceof Employee)
		{
			Employee eee=(Employee)o;
			System.out.println(eee.id+"----"+eee.name);
		}
		if(o==null)
	{
		System.out.println(o);		
		}
		}
		
		
	

	}

}
