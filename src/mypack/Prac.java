package mypack;
import java.util.Scanner;

public class Prac 
{
	Prac()
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of A and B ");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		c = a1+b1;
		System.out.println("Addition is:" + c);
		if(c>10)
		{
			System.out.println("even no");
		}
		else
		{
			System.out.println("odd no");
		}
		
	}

	public static void main(String[] args) 
	{
		new Prac();
    }

}
