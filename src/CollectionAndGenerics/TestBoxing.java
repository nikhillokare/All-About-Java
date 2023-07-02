package CollectionAndGenerics;

public class TestBoxing 
{

	public static void main(String[] args) 
	{ 
		//AutoBoxing
		int n=10;
		Integer i = new Integer(10);
		int j = n;
		System.out.println(n + " "+i+ " "+j );
		
		System.out.println("...................................");
		
		//AutoUnboxing
		xxxvalue();
		Integer a = new Integer(3);
		int s = a.intValue();
		int f = a;
		System.out.println(a + " "+s+ " "+f);
		
	}

	private static void xxxvalue() 
	{
		
		
	}

}
