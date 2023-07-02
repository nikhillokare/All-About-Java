package mypack;
class Animal3
{
	void eat()
	{
		System.out.println("Eating...");
	}
}
class Dog3 extends Animal3
{
	void eat()
	{
		System.out.println("Eating Bread...");
	}
	void bark()
	{
		System.out.println("Barking...");
	}
	void work()
	{
        super.eat();
		bark();
	}
}
public class SuperKeyword 
{
   public static void main(String[] args) 
	{
		Dog3 d=new Dog3();
		d.work();
		
    }

}
