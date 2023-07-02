package assignment12;
import java.io.File;

public class FileSpecification
{

	public static void main(String[] args)
	{
		String filename = "Voting.java";
		File f = new File(filename);
		System.out.println("filename  = "  + f.getName());
		System.out.println("isDirectory  = "  + f.isDirectory());
		System.out.println("last modified date  = "  + f.lastModified());
		System.out.println("Date = "  + f.delete());
		System.out.println("Size of file = "  + f.length());
		System.out.println("Can Read  = "  + f.canRead());
		System.out.println("Can Write  = "  + f.canWrite());
		System.out.println("Size of file  = "  + f.length());
		System.out.println("File path  = "  + f.getPath());
	}

}
