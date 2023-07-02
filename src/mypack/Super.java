package mypack;
class Animal4
{
	void eat()
	{
		System.out.println("Eating......");
	}
}
class Dog5 extends Animal4
{
	void eat()
	{
		System.out.println("Eating Bread........");
	}
	void bark()
	{
		System.out.println("Barking.....");
	}
	void work()
	{
		super.eat();
		bark();
	}
}
public class Super
{

	public static void main(String[] args) 
	{
	    Dog5 d1 = new Dog5();
	    d1.work();

	}

}
