package com.user;
import java.util.*;
public class Advisor 
{
	String arr[];
	
	public Advisor()
	{
		arr=new String[5];
		arr[0]= "Never Say No";
		arr[1]="Keep Patience";
		arr[2]="Be Careful";
		arr[3]="Go Ahead";
		arr[4]="Start Working";
	}
	
	public void getAdvice()
	{
		
		Random r=new Random();
		int x=r.nextInt(5);
		if(x==0)
		{
			System.out.println(arr[x]);
		}
		else if(x==1)
		{
			System.out.println(arr[x]);
		}
		else if(x==2)
		{
			System.out.println(arr[x]);
		}
		else if(x==3)
{
			System.out.println(arr[x]);
		}
		else if(x==4)
		{
			System.out.println(arr[x]);
		}
	}
		
}