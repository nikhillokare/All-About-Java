package assignment12;
import java.io.*;

class Employee implements Serializable
{
	 int id;
	 String name;
	String address;
	 transient String email;
	 int salary;
	 transient long contact;
}

public class Emp 
{

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "Nikhil";
		e1.address = "karad";
		e1.email = "nikhil@gmail.com";
		e1.salary = 100000;
		e1.contact = 914668050;
		
		try
		{
			FileOutputStream fout = new FileOutputStream("C:\\Users\\NIKHIL\\eclipse-workspace\\Hello world\\src\\assignment12\\ip.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(e1);
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
