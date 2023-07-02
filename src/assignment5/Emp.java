package assignment5;
class WageEmployee	
{
	int hrs,rate;
	public void ComputeSalary()
	{
	int Salary;
	Salary = hrs*rate;
	System.out.println("Salary " + Salary);
}
	}
class  Employee extends WageEmployee
{
	int id,salary;
	String name;
	String email;
	public Employee() {
		
		id = 101;
		hrs = 12;
		rate = 123;
		name = "nikhil";
		email= "nikhil@lokare";
		
	}
	public Employee(int id, int hrs, int rate, String name, String email) {
		super();
		this.id = id;
		this.hrs = hrs;
		this.rate = rate;
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", hrs=" + hrs + ", rate=" + rate + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
}

public class Emp 
{

	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.ComputeSalary();
		System.out.println(e);
	}

}
