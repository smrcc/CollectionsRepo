package strings;

public class Test4 {

	public static void main(String[] args) 
	{
		//string class equals() executed
		String s1="mahesh";
		String s2="babu";
		String s3="mahesh";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s2));
		System.out.println("MAHESH".equalsIgnoreCase("mahesh"));
		
		
		//compareTo()
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s1.compareTo(s3));
		System.out.println("MAHESH".compareToIgnoreCase("mahesh"));

	}

}
