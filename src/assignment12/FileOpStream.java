package assignment12;
import java.io.FileOutputStream;


public class FileOpStream 
{

	public static void main(String[] args) 
	{
		try
		{
		FileOutputStream f1 = new FileOutputStream("C:\\Users\\NIKHIL\\eclipse-workspace\\Hello world\\src\\assignment12\\OP.txt");
		String s = "Great Of All Times";
		byte b[]=s.getBytes();
		f1.write(b);
		f1.close();
		f1.toString();
		System.out.println("Everything is fine ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
    }

}
