package assignment5;
class WageEmployee4
{
	int sales = 66,commission = 43;
	int Salary;
	void computeSalary()
	{
	      Salary = sales*commission;	
	      System.out.println("Salary " + Salary);
	}
}
class Salesperson extends WageEmployee4
{
	int id;
	String name;
	public Salesperson() {
		
		id = 101;
		name = "Nikhil";
		
	}
	public Salesperson(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Salesperson [id=" + id + ", name=" + name + "]";
	}
	
}
public class Salesman 
{

	public static void main(String[] args) 
	{
		Salesperson s1 = new Salesperson();
		s1.computeSalary();
		System.out.println(s1);

	}

}
