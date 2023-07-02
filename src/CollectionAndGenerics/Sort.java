package CollectionAndGenerics;
import java.util.*;

public class Sort 
{

	public static void main(String[] args) 
	{
		ArrayList<Telephone> t = new ArrayList<Telephone>();
		t.add(new Telephone(12345,"Nikhil"));
		t.add(new Telephone(54343,"Sushil"));
		t.add(new Telephone(58459,"Aniket"));
		
		Comparator<Telephone> tt = Comparator.comparing(Telephone::getName);
		Collections.sort(t,tt);
		for(Telephone tp:t)
		{
			System.out.println(tp.no+" "+tp.name);
		}

	}

}
