package com.user;

public class Greeter 
{ 
	String name;
	
	public Greeter(String aName)
	{
		this.name=aName;
	}
	
	public void sayHello()
	{
		System.out.println("Hello "+ name);
	}

	public void sayGoodBye()
	{
		System.out.println("GoodBye " + name);
	}
	
}