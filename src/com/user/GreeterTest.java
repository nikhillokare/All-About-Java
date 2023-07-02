package com.user;

public class GreeterTest {

	public static void main(String[] args) 
	{
		for(int i=0;i<args.length;i++)
		{
			Greeter g=new Greeter(args[i]);
			g.sayHello();
			
		}
		Advisor ad=new Advisor();
		ad.getAdvice();
		for(int i=args.length-1;i>=0;i--)
		{
			Greeter g=new Greeter(args[i]);
			g.sayGoodBye();
		}

	}

}
