package linkedList;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

	public static void main(String[] args) 
	{
		ArrayList<Student> al=new ArrayList<Student>();
		Student t=new Student(30, 10, "mahesh");   //al.add(new Student(10,20,"mahesh"));
		Student t1=new Student(20, 15, "babu");
		Student t2=new Student(40, 8, "appala");
		al.add(t);
		al.add(t1);
		al.add(t2);
		System.out.println("sorting by age");
		Collections.sort(al, new Agecomparator());
		for(Student aa:al)
		{
			System.out.println(aa.age+"----"+aa.id+"----"+aa.name);
		}
		System.out.println("sorting by name");
		Collections.sort(al, new Namecomparator());
		for(Student ss:al)
		{
			System.out.println(ss.age+"-----"+ss.id+"----"+ss.name);
		}
	

	}

}
