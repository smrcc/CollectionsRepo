package collectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args)
	{
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student("mahesh", 101, 30);
		Student s2=new Student("babu", 91, 33);
		Student s3=new Student("appala", 100, 29);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		//System.out.println(al);
		/*Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();
			System.out.println(st.name+"--------"+st.id+"------"+st.age);
		}*/
		for(Student st:al)
		{
			System.out.println(st.name+"------"+st.id+"---------"+st.age);
		}
		

	}

}
