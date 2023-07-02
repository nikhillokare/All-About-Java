package mypack;
class Animal1
{
	void eat()
	{
		System.out.println("Eating......");
	}
}
class Dog1 extends Animal1
{
	void bark()
	{
		System.out.println("Barking......");
	}
}
class Babydog extends Dog1
{
	void weep()
	{
		System.out.println("Weeping......");
	}
}

public class MultiInheritance 
{
    public static void main(String[] args)
	{
    	Babydog d=new Babydog();
    	d.weep();
    	d.bark();
    	d.eat();
    	
	}

}
