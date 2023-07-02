package mypack;
interface Drawable
{
      void draw();
	
}
class Rectangle1 implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing Rectangle");
	}
	
}
class Circle1 implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
}

public class Interface 
{
    public static void main(String[] args) 
	{
		Drawable d=new Circle1();
		d.draw();
		
	}

}
