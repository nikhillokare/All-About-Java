package assignment12;
import java.io.*;
import java.io.RandomAccessFile;

public class Random 
{
	static final String FILEP = "C:\\Users\\NIKHIL\\eclipse-workspace\\Hello world\\src\\assignment12\\ip.txt";

	public static void main(String[] args) throws IOException
	{
		try
		{
	 	    System.out.println(readfromfile(FILEP,0,20));
	 	    writetofile(FILEP,"Welcome to new Random Access",30);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
     public static byte [] readfromfile(String Fname,int position,int size) throws IOException
     {
    	 RandomAccessFile file = new  RandomAccessFile(Fname,"r");
    	 file.seek(position);
    	 byte[] bytes = new byte [size];
    	 file.read(bytes);
    	 file.close();
    	 return bytes;
     }	 
		public static void writetofile (String fname,String data,int position) throws IOException
		{
			RandomAccessFile file = new RandomAccessFile(fname,"rw");
			file.seek(position);
			file.write(data.getBytes());
			file.close();
			

	}

}
