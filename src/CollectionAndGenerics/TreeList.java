package CollectionAndGenerics;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeList 
{
    public static void main(String[] args) 
	{
		 TreeSet<Customer> t = new TreeSet<Customer>();
	     t.add(new Customer (1001,"Nikhil"));
	     t.add(new Customer (1002,"Aniket"));
	     t.add(new Customer (1003,"Sushil"));
	     t.add(new Customer (1004,"Sanket"));
	     t.add(new Customer (1005,"Mortal"));
	     
	     Comparator<Customer> cm = Comparator.comparing(Customer::getId);
	     Collections.sort(t,cm);
	     System.out.println("Sorting By ID ");
	     for(Customer c1:t)
	      {
	         System.out.println(c1.id+" "+c1.name);
	      }

	}

}
