package Programmes;

public class b {

	public static void main(String[] args) 
	{
		int arr[]= {45,25,35,87,-12,-43};
		
		
		b.bubblesort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
 
	}


static void bubblesort(int arr[])
{
	int n=arr.length;
	int temp=0;
	
	for(int i=0;i<n;i++)
	{
		for(int j=1;j<(n-i);j++)
		{
			if(arr[j-1]>arr[j])
			{
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
	}
}
}
