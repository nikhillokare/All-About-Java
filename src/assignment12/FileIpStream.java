package assignment12;
import java.io.FileInputStream;

public class FileIpStream 
{

	public static void main(String[] args) 
	{
		try
		{
			FileInputStream f=new FileInputStream("C:\\Users\\NIKHIL\\eclipse-workspace\\Hello world\\src\\assignment12\\IP.txt");
			int i=0;
			while((i=f.read())!=-1)
			{
				System.out.print((char)i);
			}
			f.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
