package Programmes;

public class secondsmallest {

	public static void main(String[] args) 
	{
		 int[] a = {-11,10,13,55,66};
		 if(a[0]<a[1]) {
			 int temp=a[0];
			 a[0]=a[1];
			 a[1]=temp;
		 }
		 int first=a[0];
		 int second=a[0];
		 
		 for(int i=0;i<a.length;i++)
		 {
			 if(first>a[i])
			 {
				 second=first;
				 first=a[i];
			 }
			 else if(second>a[i])
			 {
				 second=a[i];
			 }
		 }
		  System.out.println(second);
		}
}
	


