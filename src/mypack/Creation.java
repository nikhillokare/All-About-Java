package mypack;
import java.util.Scanner;

class user
{
	int id;
	String name;

    user(int no,String name)
    {
    	this.id=no;
    	this.name=name;
    }

	@Override
	public String toString() {
		return "  [id=" + id + ", name=" + name + "]";
	}
    

}
public class Creation 
{
     
	public static void main(String[] args) 
	{
	      user arr[]= new user[5];
	      System.out.println("Enter id and name");
	      Scanner sc=new Scanner(System.in);
	      int id;
	      String name;
	      for( int i=0;i<5;i++)
	      {
	         id=sc.nextInt();
	         sc.nextLine();
	    	 name=sc.nextLine();
	    	 arr[i]=new user(id,name);
	      }
	      for(int i=0;i<5;i++) 
	      {
			   System.out.println(arr[i].toString());
          }    
	}
}
