package mypack;

public class Area 
{

	public static void main(String[] args) 
	{
		int r,l,b,s;
		float pi=3.14f;
		float area;
		{
			r=3;l=5;b=4;s=3;
			area=pi*r*r;
			System.out.println("Area of the circel of radius "+r+" is "+area);
			area=l*b;
			System.out.println("Area of the rectangle of length "+l+" breath "+b+ " is "+area);
			area=s*s;
			System.out.println("Area of square of side " +s+ " is "+area);
			
			
		}

	}

}
