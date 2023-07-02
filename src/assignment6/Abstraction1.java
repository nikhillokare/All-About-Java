package assignment6;
abstract class Instrument
{
	 abstract void play();
}
 class Piano extends Instrument
{

	@Override
	public void play()
	{
	    System.out.println("“Piano is playing tan tan tan tan”");
		
	}
	
} class Flute extends Instrument
{

	@Override
	public void play() 
	{
		System.out.println("“Flute is playing toot toot toot toot”");
		
	}
	
}
 class Guiter extends Instrument
{

	@Override
	public void play() 
	{
		System.out.println("“Guitar is playing tin tin tin”");
		
	}
	
}
public abstract class Abstraction1 
{

	public static void main(String[] args) 
	{
		Instrument arr[] = new Instrument[3];
		arr [0] = new Piano();
		arr [1] = new Flute();
		arr [2] = new Guiter();
		for(int i=0;i<3;i++)
		{
			arr[i].play();
		}

	}

}
