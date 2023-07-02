package assignment14;
class Thread11 extends Thread
{
	String msg = "";
    Thread11(String msg)
    {
         this.msg = msg;
    }    
	public void run()
	{
		try
        {
             while (true)
             {
                  System.out.println(msg);
                  Thread.sleep(400);
             }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        } 
	}
}
class Thread22 extends Thread
{
	String msg = "";
    Thread22(String msg)
    {
         this.msg = msg;
    }
	public void run()
	{
		try
        {
             while (true)
             {
                  System.out.println(msg);
                  Thread.sleep(400);
             }
        }
        catch (Exception ex)
        {
             ex.printStackTrace();
	
        }
	}
}

public class Demo3
{

	public static void main(String[] args)
	{
		Thread11 t1=new Thread11("Running Thread1..........");
		Thread22 t2=new Thread22("Running Thread2..........");
		t1.start();
		t2.start();		

	 }
}

