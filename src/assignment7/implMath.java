package assignment7;
import java.math.*;
import java.util.Scanner;

public class implMath implements MyMath 
{

	@Override
	public double sqr(double a) 
	{
		a = Math.sqrt(a);
		System.out.println("sqrt a : " +a);
		return a;
	}

	@Override
	public double cube(double a) 
	{
		a = Math.cbrt(a);
		System.out.println("cbrt a : " +a);
		return a;
		
	}

	@Override
	public double cosine(double a) 
	{
		a = Math.cos(a);
		System.out.println("cos a : " +a);
		return a;
		
	}

	@Override
	public double sine(double a) 
	{
		
		a = Math.sin(a);
		System.out.println("sin a : " +a);
		return a;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of A");
		implMath m = new implMath();
		double z = sc.nextDouble();
		m.sqr(z);
		m.cube(z);
		m.cosine(z);
		m.sine(z);
		

	}

}
