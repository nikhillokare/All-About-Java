package assignment14;
class Fib extends Thread
{
    public void run()
    {
    	  try
          {
               int a=0, b=1, c=0;
               System.out.print("Enter the Limit for fabonacci: ");

               int n = 10;
               System.out.println("\n...........................");
               System.out.println("Fibonacci series:");
               System.out.println("............................");
               while (n>0)
               {
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
               }
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
    }
    	
}
class Rev extends Thread
{
	public void run()
	{
		 try
         {
              System.out.println("\n.......................");
              System.out.println("\nReverse is: ");
              System.out.println("..........................");
              for (int i=10; i >= 1 ;i-- )
              {
                   System.out.print(i+"  ");
              }
              System.out.println("\n.............................\n\n");
         }
         catch (Exception ex)
         {
              ex.printStackTrace();
         }
	}
}

public class FibRev
{

	public static void main(String[] args) 
	{
		 try
         {
              Fib fib = new Fib();
              fib.start();
              fib.sleep(400);
              Rev rev = new Rev();
              rev.start();
         }
         catch (Exception ex)
         {
              ex.printStackTrace();
         }
	}

}
