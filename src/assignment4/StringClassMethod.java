package assignment4;
import java.lang.String;

public class StringClassMethod 
{

	public static void main(String[] args) 
	{
		String str="Nikhil";
		String str1="OG";
		System.out.println(str.length());
		System.out.println(str.concat(str1));
		System.out.println(str.compareTo(str1));
		System.out.println(str.trim());
		System.out.println(str.toLowerCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str.substring(5));
		System.out.println(str1.substring(1));
		System.out.println(str.substring(1,4));
		System.out.println(str.startsWith("Nik"));
		System.out.println(str.startsWith("hil"));
		System.out.println(str1.startsWith("Nik"));
		System.out.println(str1.startsWith("OG"));
		System.out.println(str.charAt(3));
		System.out.println(str1.charAt(0));
		System.out.println(str.indexOf("l"));
		System.out.println(str.lastIndexOf("i",5));
		System.out.println(str.equalsIgnoreCase("aniket"));
	
		
	}

}
