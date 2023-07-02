package assignment12;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferdClass  
{

	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream   fout = new FileOutputStream("C:\\Users\\NIKHIL\\eclipse-workspace\\Hello world\\src\\assignment12\\ip.txt");
			BufferedOutputStream  bout = new BufferedOutputStream(fout);
			String s = "valorant";
			byte b[]= s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			System.out.println("Everything is done");
		 }
		catch(Exception e) 
		{
			 System.out.println(e);
			
		}
	}
		

}
