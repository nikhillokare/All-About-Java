package assignment12;
import java.io.*;
import java.io.Serializable;

class Student implements Serializable
{
      int id;
      int rollno;
	  String name;
}

public class STD 
{

	public static void main(String[] args) 
	{
		Student s = new Student();
		s.id = 1001;
		s.name = "Nikhil";
		s.rollno = 10;
		try
		{
			FileOutputStream fout = new FileOutputStream("C:\\Users\\NIKHIL\\eclipse-workspace\\Hello world\\src\\assignment12\\ip.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s);
			out.close();
			fout.close();
			System.out.println("Serializable data Strored in IP.txt");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
