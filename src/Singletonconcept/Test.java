package Singletonconcept;

public class Test {
	                                //In oop a singleton class is a class that can have only one object at a time
	                                //How to design singleton class
	                                //make constructor as private
	                                //write public static method that have  return type of object of this singleton class(Lazy initilization)
	private static Test t=null;
	public String name;
	private Test( )
	{
		name="i am using singleton class  pattern ";
	}
     public static Test gettest()
     {
    	 if(t==null)
    	 {
    		 t=new Test();
    	 }
    	 return t;
     }
     public static void main(String[] args) 
     {
    	 Test t=Test.gettest();
    	 //t.name=(t.name).toUpperCase();
    	 System.out.println(t.name);
    	 Test t1=Test.gettest();
    	 System.out.println(t1.name);
    	
		
	}
}
