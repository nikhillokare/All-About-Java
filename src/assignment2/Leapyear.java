package assignment2;

public class Leapyear 
{

	public static void main(String[] args) 
	{
		int year=2018;
		if(((year % 4 == 0 ) && (year % 100 != 0)) || (year % 400 == 0))
		{
			System.out.println(year + " is Leap Year");
		}
		else
		{
			System.out.println(year + " is Not Leap Year");
		}

	}

}
