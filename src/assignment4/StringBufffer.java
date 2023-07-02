package assignment4;
import java.lang.StringBuffer;

public class StringBufffer 
{

	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Nikhil");
		int len = s1.length();
		int cap = s1.capacity();
		s1.append("op");
		s1.reverse();
		s1.delete(1, 3);
		s1.insert(6, "Empire");
		System.out.println(len);
		System.out.println(cap);
		System.out.println(s1);
		
		
		
	}

}
