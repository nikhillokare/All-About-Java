package assignment3;

import java.util.Scanner;

class addition
{
	static int add (int a,int b)
	{
		return a+b;
	}
	static int add (int a,int b,int c)
	{
		return a+b+c;
	}
}

public class ClassAddition 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
		 int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("addition is : "+addition.add(a, b));
		System.out.println("addition is : "+addition.add(a, b,c));		
	}

}
