package strings;

public class Emp1 
{
	String name;
	int age;
	Emp1(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
public String toString() 
{
	return " name="+name+"  age="+age;		
		
	}
public static void main(String a)
{
	Emp1 e=new Emp1("mahesh",30);
	System.out.println(e);
	
}
public static void main(String ...args)
{
	Emp1 e=new Emp1("mahesh",30);
	System.out.println(e);
	
}
}
