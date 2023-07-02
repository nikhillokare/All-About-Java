package assignment12;
import java.io.*;

public class ReadWrite 
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream in = null;
		FileOutputStream out = null;
		try
		{
			in = new FileInputStream("C:\\Users\\NIKHIL\\eclipse-workspace\\Hello world\\src\\assignment12\\ip.txt");
			out  = new FileOutputStream("C:\\Users\\NIKHIL\\eclipse-workspace\\Hello world\\src\\assignment12\\op.txt");
			 
			 int c;
			 while((c=in.read())!= -1);
			 {
				 out.write(c);
			 }
		}
        finally
		{
			if(in !=null)
			{
			    in.close();
			}
			if(out!=null)
			{
				out.close();
			}
		}
    }  
}


