package mypack;
class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is Running");
	}
}
class Bike extends Vehicle
{
	//void run()
	//{
	//	System.out.println("Change gear");
	//}
}

public class Overriding 
{

	public static void main(String[] args) 
	{
		Bike obj=new Bike();
		obj.run();

	}

}
