package mypack;
class nikhil
{
	public void run()
	{
		System.out.println("Full Stack java Developer");
		System.out.println("Full Stack .net Developer");

	}
}
class Aniket extends nikhil
{
	public void fast()
	{
		System.out.println("No java Developer");
		System.out.println("Yes java Developer");
	}
}
class Sushil extends Aniket
{
	public void cut()
	{
	    System.out.println("nikhil");
	    System.out.println("aniket");
	}
}
public class Practise 
{

	public static void main(String[] args) 
	{
		Sushil s = new Sushil();
		s.fast();
		s.run();
		s.cut();
	}

}
