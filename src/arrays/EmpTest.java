package arrays;

public class EmpTest {

	public static void main(String[] args) 
	{
		Emp e1=new Emp("mahesh", 10);
		Emp e2=new Emp("babu", 100);
		Emp e3=new Emp("appala", 8);
		Emp [] e=new Emp[3];
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		for(Emp ee:e)
		{
			System.out.println(ee.id+"----"+ee.name);
		}
		
	

	}

}
