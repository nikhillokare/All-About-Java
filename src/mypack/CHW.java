package mypack;
import java.util.Scanner;

public class CHW {

	public static void main(String[] args) {
		
		System.out.println("Taking input from user");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = scn.nextInt();
        System.out.println("Enter number 2");
        int b = scn.nextInt();
        int sum = a+b;
        System.out.println("The sum of two number is: ");
        System.out.println(sum);


	}

}
