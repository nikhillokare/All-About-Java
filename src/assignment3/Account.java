package assignment3;

import java.util.Scanner;

class Account1
{
	int a;
	int amt;
	String nm;

  Account1()
   {
	   a=1234456;
	   amt=3455;
	   nm="nikhil";
   }
     	
     Account1(int acno, int am,String Name)
     {
    	 a=acno;
    	 amt=am;
    	 nm=Name;
     }
     void ToString()
     {
    	 System.out.println(a);
    	 System.out.println(amt);
    	 System.out.println(nm);
     }
     void Deposite(int a)
     {
    	 amt=amt+a;
    	 System.out.println("Amount Deposite ");
    	 System.out.println("total Amount" + amt);
    	 
     }
     void Withdraw(int b)
     {
    	 if(amt>b)
    	 {
    		 amt=amt-b;
        	 System.out.println("Amount Withdraw ");
        	 System.out.println("total Amount"+ amt);
    	 }
    	 else
    	 {
    		 System.out.println("Insufficient Balance");
    	 }
     }
}     
public class Account 
{
	

	public static void main(String[] args)
	{
		System.out.println("Enter the Details");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		String c=sc.nextLine();
		
		System.out.println("Account no: " +a);
		System.out.println("Amount: " +b);
		System.out.println("Name: " +c);
		
		Account1 ac1=new Account1();
		ac1.ToString();
		ac1.Deposite(10000);
		ac1.Withdraw(1000);
		
		Account1 ac2=new Account1(a,b,c);
		ac2.ToString();
		System.out.println("enter amount you want to deposite");
		int d=sc.nextInt();
		ac2.Deposite(d);
		System.out.println("enter amount you want to withdraw");
		int w=sc.nextInt();
		ac2.Withdraw(w);
		
		
		
	}

}
