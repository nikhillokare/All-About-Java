package assignment2;

public class Armstronge 
{

	public static void main(String[] args) 
	{
		int num=406, r,temp ,total=0;
		
		temp=num;
        while(num>0) 
        {
        	r=num%10;
        	total=total+(r*r*r);
        	num=num/10;
        	
        }
        if(temp==total)
        {
        	System.out.println("is Armstrong number");
        }
        else
        {
        	System.out.println("is not Armstrong number");
        }
	}

}
