package CollectionAndGenerics;
import java.util.*;

public class Hashseteg
{
	public static void main(String args[]) 
	{

	    ArrayList<String> s=new ArrayList<String>();
		s.add("Ajay");
		s.add("Nikhil");
		s.add("Sagar");
		s.add("50");
		s.add("Mayur");
		String b = s.get(1);
		System.out.println(b);
		int a = s.size();
		System.out.println(a);
		System.out.println(s.isEmpty());
		
		
	    Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
      