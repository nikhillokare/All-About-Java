package mypack;
class Animal2
{
	void eat()
	{
		System.out.println("Eating......");
	}
}
class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("Barking......");
	}
}
class Cat extends Animal2
{
	void meow()
	{
		System.out.println("Meowing......");
	}
}

public class HirarchiInheritance 
{
   public static void main(String[] args) 
   {
		Cat c=new Cat();
		c.meow();
		c.eat();
		Dog1 d=new Dog1();
		d.bark();
		d.eat();
   }

}
