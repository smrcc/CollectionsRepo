package Programmes;

public class Bubblesort {

	public static void main(String[] args) 
	{
		int arr[]= {400,300,200,105,75,-11,109};
		
		System.out.println(" Array Before bubble sort ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		System.out.println("array after bubblesort");
		bubblesort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ "  ");
		}
	}


static void bubblesort(int arr[])
{
	int n=arr.length;
	int temp=0;
	
	for(int i=0;i<n;i++) {
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
}}

