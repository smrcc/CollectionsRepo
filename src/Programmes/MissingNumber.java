
package Programmes;

public class MissingNumber {

	public static void main(String[] args)
	{

		
		int a[]= {9,10,12,13,14,15,16,17,18,19,20,21,22,23,24,25}; //1+2+3+4+5+7+8+9+10 =49
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		int sum1=0;
		for(int j=9;j<=25;j++)   //1+----------+10=55
		{
			sum1=sum1+j;
		}
System.out.println(sum1-sum);   //55-49
	}

}
