package mypack;
abstract class Shape
{
	abstract void draw();
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}

 class TextAbstraction 
{
	
	public static void main(String[] args) 
	{
		Shape s=new Rectangle();
		s.draw();
    }

}
