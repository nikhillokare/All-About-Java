package mypack;
import java.util.Scanner;

public class Simple {

	public static void main(String[] args) 
	{
	     int n;
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the number");
	     int n1  = sc.nextInt();
	     if(n1%2==0)
	     {
	    	 System.out.println("is Even no " );
	     }
	     else
	     { 
	    	 System.out.println("is Odd no ");
	     }

	}

}
