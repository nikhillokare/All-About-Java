package assignment6;

import java.util.Random;

class Medicine
{
	String name = "ITC";
	String address = "karad";
	void displaylable()
	{
		String name,address;
	}
}
class Tablet extends Medicine
{
	void displaylable()
	{
		System.out.println("Name: " + name);
		System.out.println("Address: "+ address);
		System.out.println("“store in a cool dry place”");
	}
}
class Syrup extends Medicine
{
	void displaylable()
	{ 
		System.out.println("Name: " + name);
		System.out.println("Address: "+ address);
		System.out.println("“Only used for Internal”");
	}
}
class Ointment extends Medicine
{
	void displaylable()
	{ 
		System.out.println("Name: " + name);
		System.out.println("Address: "+ address);
		System.out.println("“for external use”");
	}
}
public class TestMedicine 
{

	public static void main(String[] args)
	{
		Medicine arr[] = new Medicine[3];
		Random r = new Random();
		for(int i=0;i<3;i++)
		{
			int rr = r.nextInt(3);
			if(rr==0)
			{
				arr[i] = new Tablet();
			}
			else if(rr==1)
			{
				arr[i] = new Syrup();
			}
			else
			{
				arr[i] = new Ointment();
			}
		}	
			for( int i=0;i<3;i++)
			{	
			arr[i].displaylable();
		    }
	    }

	}

