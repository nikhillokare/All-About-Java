package mypack;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) 
	{
		int n,temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n1  =sc.nextInt();
		for(int i=2;i<n1;i++)
		{
			if(n1%i==0)
			{
                temp++;				
			}
		}
		if(temp>0)
		{
			System.out.println("is prime no");
		}
		else
		{
			System.out.println("is not prime no");
		}
		
	}

}
