package assignment12;
import java.io.*;

public class Deserialization  
{

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
	     Student s = null;
	     try
	     {
	    	FileInputStream fin = new FileInputStream("C:\\Users\\NIKHIL\\eclipse-workspace\\Hello world\\src\\assignment12\\ip.txt");
	    	ObjectInputStream oin = new ObjectInputStream(fin);
	    	s = (Student)
	        oin.readObject();
	    	oin.close();
	    	fin.close();
	    	
	     }
	     finally
	     {
	    	 System.out.println("Deserialization  Student");
	    	 System.out.println("Student ID: " + s.id );
	    	 System.out.println("Student Name: " + s.name);
	    	 System.out.println("Student RollNo: " + s.rollno);
	    	 
	     }
	}

}
