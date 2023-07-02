package assignment7;
 import java.util.Scanner;

class Relation implements Relational 
{
	int a, b;
	 Relation(int a,int b)
	{
	 this.a=a;
	 this.b=b;
	 }
     
	 @Override
	public void greaterThan()
	 {
		 if(a>b)
		 {
			 System.out.println(a + " " + " is Greater");
		 }
		 else
		 {
			 System.out.println(b + " " + " is Greater");
		 }
	 }

	@Override
	public void lessThan() 
	{
		if(a<b)
		 {
			 System.out.println(a + " " + " is Less");
		 }
		 else
		 {
			 System.out.println(b + " " + " is Less");
		 }

	}

	@Override
	public void greaterThaneq() 
	{
		if(a>=b)
		 {
			 System.out.println(a + " " + " is Greater Than EQ");
		 }
		 else
		 {
			 System.out.println(b + " " + " is Greater Than EQ");
		 }
	 }

	@Override
	public void lessThaneq() 
	{
		if(a<=b)
		 {
			 System.out.println(a + " " + " is Less Than EQ");
		 }
		 else
		 {
			 System.out.println(b + " " + " is Less Than EQ");
		 }
    }

}

public class RelationDemo 
{
   
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of A and B");
		int x = sc.nextInt();
		int y = sc.nextInt();
		Relation r = new Relation(x,y);
		r.greaterThan();
		r.lessThan();
		r.greaterThaneq();
		r.lessThaneq();

	}

}
