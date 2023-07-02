package assignment2;

public class FactorialNo
{

	public static void main(String[] args) 
	{
		int fact=1;
		int no= 8;
		for( int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
	
		System.out.println("factorial of 8 is: "+ fact);
	}

}
