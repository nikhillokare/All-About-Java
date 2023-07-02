package CollectionAndGenerics;
import java.util.*;

public class LinkedListeg {

	public static void main(String[] args)
	{
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Nikhil");
		l1.add("Aniket");
		l1.add("Nikhil");
		l1.add("Aniket");
		
		Iterator i = l1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
