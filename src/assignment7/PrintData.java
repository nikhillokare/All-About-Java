package assignment7;
import java.util.*;

public class PrintData implements Student, Batch {

	@Override
	public void showbatch(String a) 
	{
	
		System.out.println("Batch: " + a);

	}

	@Override
	public void showstudent(int id,String name) 
	{
		
		System.out.println("Id: " +id);
		System.out.println("Name: " +name);
		
	}

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Batch,ID and Name");
		String s= sc.nextLine();
		int r= sc.nextInt();
		sc.nextLine();
		String p = sc.nextLine();
		PrintData pd = new PrintData();
		pd.showbatch(s);
		pd.showstudent(r,p);
	}

}
