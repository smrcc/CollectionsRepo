package arrays;

public class Employee1Test {

	public static void main(String[] args) 
	{

		Employee1 e11=new Employee1("india", 10);
		Employee1 e22=new Employee1("andhrapradesh", 100);
		Employee1 e33=new Employee1("prakasam", 8);
		Employee1 [] e1=new Employee1[5];
		e1[0]=e11;
		e1[2]=e22;
		e1[4]=e33;
		for(int i=0;i<e1.length;i++)
		{
			if(e1[i] == null)   //if(e1[i]!=null)   output 0 2 4 index
			{
			System.out.println(i);	
			}
		}
		
		

	}

}
