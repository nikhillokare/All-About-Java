package assignment14;
 class MultiThread1 implements Runnable
{
     public void run()
     {
     for( int i=0;i<1;i++)
     {
    	System.out.println("I am Nikhil"); 
	 }
     
     }
	
 }
 class MultiThread2 implements Runnable
 {
      public void run()
      {
      for( int i=0;i<1;i++)
      {
     	System.out.println("Nikhil is op"); 
 	  }
 	
   }
 }   
 class MultiThread3 implements Runnable
 {
      public void run()
      {
      for( int i=0;i<1;i++)
      {
     	System.out.println("Nikhil OG"); 
 	  }
 	
   }
 }      
 
 


public class RunningThread 
{

	public static void main(String[] args)
	{
	      MultiThread1 bullet1=new  MultiThread1();
	      Thread gun1=new Thread(bullet1);
	      MultiThread2 bullet2=new  MultiThread2();
	      Thread gun2=new Thread(bullet2);
	      MultiThread3 bullet3=new  MultiThread3();
	      Thread gun3=new Thread(bullet3);
	      gun1.start();
	      gun1.setPriority(Thread.MAX_PRIORITY);
          gun2.start();
          gun1.setPriority(Thread.MIN_PRIORITY);
          gun3.start();
          gun1.setPriority(Thread.NORM_PRIORITY);
        
	}
}

