package CollectionAndGenerics;
import java.util.*;

public class Vectoreg {

	public static void main(String[] args) 
	{
		Vector<String> l1 = new Vector<String>();
		l1.add("Nikhil");
		l1.add("Nikhil");
		l1.add("Nikhil");
		l1.add("Aniket");
		
		Iterator i = l1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
