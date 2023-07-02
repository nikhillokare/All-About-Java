package CollectionAndGenerics;
import java.util.*;
public class ArrayListDemo {

	

	public static void main(String[] args) 
	{
	    ArrayList<String> i1 = new ArrayList<String>();
	    i1.add("Nikhil");
	    i1.add("Aniket");
	    i1.add("Sushil");
	    //i1.remove(0);
	    String b = i1.get(1);
	    System.out.println(b);
	    Collections.sort(i1);
	    for(String s:i1)
	    System.out.println(s);
	    Collections.reverse(i1);  
        System.out.println(" Reverse");  
        System.out.println(i1); 
	    
	    Iterator i = i1.iterator();
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }
	    

	}

}
