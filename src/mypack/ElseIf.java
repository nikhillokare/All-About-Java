package mypack;
import java.util.Scanner;

public class ElseIf 
{

	public static void main(String[] args) 
	{ 
		
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		
		switch(button)
		{
		  case 1: System.out.println("Hello World");
		  break;
		  case 2: System.out.println("Namaste");
		  break;
		  case 3: System.out.println("Hey");
		  break;
		  default : System.out.println("Invalid");
			  
		}
		
		
		
		
	}

}
