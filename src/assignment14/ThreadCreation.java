package assignment14;
class java1 extends Thread
{
    public void run()
	{
		int i=0;
	    while(i<50)
		{
			System.out.println("Nikhil OP");
			i++;
		}
	    
}    }
class java2 extends Thread
{
	public void run()
	{
		int i=0;
	    while(i<30)
		{
			System.out.println("Nikhil GG");
			i++;
			 
		}
	}
}

public class ThreadCreation 
{

	public static void main(String[] args)
	{

		java1 j1=new java1();
		java2 j2=new java2();
		j1.start();
		j1.setPriority(Thread.MAX_PRIORITY);
		//try {
		//	j1.join();
		//} catch (InterruptedException e) {
			
		//	e.printStackTrace();
		//}
		j2.start();
		j2.setPriority(Thread.MIN_PRIORITY);
		
	}

}
