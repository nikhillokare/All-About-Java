package assignment10;
import javax.swing.*;

public class ProgrsssBarEg extends JFrame
{
	JProgressBar jb;
	int i=0, num=0;
	
	ProgrsssBarEg()
	{
		jb = new JProgressBar(0,2000);
		jb.setBounds(50,50,160,40);
		jb.setValue(0);
		jb.setStringPainted(true);
		add(jb);
		setSize(300,300);
		setLayout(null);
	}
	public void calculate()
	{
		while(i<=2000)
		{
			jb.setValue(i);
			i = i+20;
			try
			{
				Thread.sleep(100);			
		    }
		    catch(Exception e)
		    {
		    	
		    }
	   }  
	
    }
	
	public static void main(String[] args) 
	{
		ProgrsssBarEg m = new ProgrsssBarEg();
		m.setVisible(true);
		m.calculate();
          
	}

}
