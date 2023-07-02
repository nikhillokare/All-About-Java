package CollectionAndGenerics;

public class Employee 
{
	int id;
	String name;
	int basic;
	

	public Employee(int id, String name, int basic) {
		super();
		this.id = id;
		this.name = name;
		this.basic=basic;
	}
	
   @Override
	public String toString() 
   {
		return "Employee [id=" + id + ", name=" + name + ", basic=" + basic + "]";
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) 
	{
		

	}

}
