package assignment12;
import java.io.*;

public class BufferedReader2
{

	public static void main(String[] args) throws IOException 
	{
		FileReader r = new FileReader("C:\\Users\\NIKHIL\\eclipse-workspace\\Hello world\\src\\assignment12\\ip.txt");
		BufferedReader br = new BufferedReader(r);
		 int i;
		 while((i=br.read())!=-1)
		 {
			 System.out.print((char)i);
		 }
		 r.close();
		 br.close();

	}

}
