package strings;

public class Emp 
{
	String name;
	int id;
	Emp(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public static void main(String[]args)
	{
		Emp e1=new Emp("mahesh",36);
		System.out.println(e1);
		System.out.println(e1.toString());//object class tostring()executed i.e parent class is 
	}

}
