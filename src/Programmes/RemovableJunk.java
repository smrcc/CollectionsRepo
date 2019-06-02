package Programmes;

public class RemovableJunk {

	public static void main(String[] args) 
	{

		//by using regular expression [a-zA-Z0-9] 
		String s="@@@@@@@@ mahesh 1234 ########### babu%%%%%%%%%%%% appala";

		s=s.replaceAll( "[^a-zA-Z0-9]" , "");
		System.out.println(s);

	}

}
