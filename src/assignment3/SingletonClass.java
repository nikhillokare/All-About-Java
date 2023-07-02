package assignment3;
class Bag
{
	private static Bag bag;
	
	private Bag()
	{
		//System.out.println("Bag is op");
	}
	
	public static Bag getInstance()
	{
		if (null==bag)
		{
			bag = new Bag();
		
		}
		return bag;
	}


public class SingletonClass {
	
	public static void main(String args[])
	{
		Bag bag= Bag.getInstance();
	}
}

}
