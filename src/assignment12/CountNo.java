package assignment12;
import java.io.FileReader;
import java.io.BufferedReader;

public class CountNo 
{

	public static void main(String[] args) 
	{ 
		try
		{
			 String line;
			 int count = 0;
		FileReader file = new FileReader("C:\\Users\\NIKHIL\\eclipse-workspace\\Hello world\\src\\assignment12\\ip.txt");
		BufferedReader br = new BufferedReader(file); 
		while((line = br.readLine()) != null)
		{
			String words[] = line.split(" "); 
			count = count + words.length;
		}
		System.out.println("no of words in file: "  + count);
		 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
