package assignment6;
abstract class Shape
{
	abstract void area();
}
class Circle extends Shape
{
	void area()
	{ 
		float r = 65;
		float circle = (float) (3.14*r*r);
		System.out.println("Area of circle: " + circle);
	}
}
 class Cylinder extends Shape
 { 
 	void area()
 	{
 		 float r = 6;
 		 float h = 5;
 		float cylinder = (float) ((2*3.14*r*h)+(2*3.14*r*h));
 		System.out.println("Area of Cylinder: " + cylinder);
 	}
 }
 class Square extends Shape
 {
	 void area()
 	{
 		float a = 7 ;
 		float square = a*a;
 		System.out.println("Area of square: " + square);
 	}
 }
 class Rectangle extends Shape
 {
	   void area()
 	{ 
 		float w =5;
	    float l = 7;
 		float reactangle = w*l;
 		System.out.println("Area of rectangle: " + reactangle);
 	}
 }


public class shapes 
{

	public static void main(String[] args) 
	{
		Shape arr[] = new Shape[4];
		arr [0] = new Circle();
		arr [1] = new Cylinder();
		arr [2] = new Square();
		arr [3] = new Rectangle();
		for(int i=0;i<4;i++)
		{
			arr[i].area();
		}

	}

}
