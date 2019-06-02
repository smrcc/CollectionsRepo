package linkedList;

public class TreeSetBook implements Comparable
{
	String name;
	String author;
	int id;
	int age;
	TreeSetBook(String name,String author,int id,int age)
	{
		this.name=name;
		this.author=author;
		this.id=id;
		this.age=age;
	}
	@Override
	public int compareTo(Object o) {
		TreeSetBook t=(TreeSetBook)o;
		if(age>t.age)
		return 1;
		else if(age<t.age)
			return -1;
		else return 0;
	}
	

}
