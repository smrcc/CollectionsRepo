package arrays;

public class Test2 {

	public static void main(String[] args)
	{
		int a[]={10,20,30,35,50};
		int mul=1;
		for(int i=0;i<a.length;i++)
		{
			mul*=a[i];
			//System.out.println(mul);
		}
		System.out.println(mul);
	}

}
