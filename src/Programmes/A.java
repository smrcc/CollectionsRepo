package Programmes;

public class A {

	public static void main(String[] args) 
	{
	int num=141;
	boolean b=true;
	
	while(num>0)
	{
		if(num%2==0)
		{
			System.out.println("Not prime number");
			b=false;
			break;
		}
		else
		{
			System.out.println("Prime number");
			b=true;
			break;
		}
	}
	}

	}


