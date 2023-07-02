package mypack;
abstract class TwoWheeler
{
	TwoWheeler()
	{
		System.out.println("Bike is created");
	}
	abstract void run();
	void ChangeGear()
		{
			System.out.println("change gear");
		}
}
class Honda extends TwoWheeler
{
	void run()
	{
		System.out.println("Running safely");
	}
}

public class AbstractClass 
{
    public static void main(String[] args) 
	{
		TwoWheeler obj=new Honda();
		obj.run();
		obj.ChangeGear();

	}

}
