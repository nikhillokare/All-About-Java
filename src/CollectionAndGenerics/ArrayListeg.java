package CollectionAndGenerics;
import java.util.*;

public class ArrayListeg {

	public static void main(String[] args) 
	{
		ArrayList<String> l1 = new ArrayList<String>();
		List<Integer> i1 = new ArrayList<Integer>();
		l1.add("Nikhil");
		l1.add("Aniket");
		l1.add("Sushil");
		l1.add("Panda");
		l1.set(3, "Rahul");
		
		i1.add(10);
		i1.add(20);
		i1.add(30);
		i1.add(40);
		i1.add(50);
		
		Collections.sort(i1);
		for(Integer n:i1)
		
			System.out.println(n);

		
		Iterator itr1 = l1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		

	}

}
