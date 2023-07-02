package assignment5;
import java.util.*;
class Employee2
{
    void ComputeSalary(int fixedsalary, int incentives)
	{  
    	int salary;
		salary = fixedsalary*incentives;
		System.out.println("salary " + salary);
	}
}
class Managerrr extends Employee2
{
	int id;
	String name;
	public Managerrr() {
		
		id = 111;
	    name = "Raj";
	   
	}
	public Managerrr(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "Managerrr [id=" + id + ", name=" + name + "]";
	}
	
	
	
}

public class Manager 
{

	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the id and name");
	    int n = sc.nextInt();
	    sc.nextLine();
	    String p = sc.nextLine();
	    Managerrr m = new Managerrr(n,p);
	    System.out.println("Enter fixedSalary and Incentives");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    System.out.println(m.toString());
	    m.ComputeSalary(a, b);
	    
	    
	}

}
