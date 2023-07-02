package assinment9AWT;
import java.awt.*;
import java.awt.event.*;

public class ScrollBar1
{
	
	ScrollBar1()
	{
		Frame f = new Frame();
		Scrollbar s1 = new Scrollbar();
		Scrollbar s2 = new Scrollbar();
		Scrollbar s3 = new Scrollbar();
		
		
	    s1.setBounds(700,50,20,200);
	    s2.setBounds(730,50,20,200);
		s3.setBounds(760,50,20,200);
		
		f.setBackground(Color.pink);
		s1.setBackground(Color.red);
		s2.setBackground(Color.green);
		s3.setBackground(Color.orange);
		
	    f.add(s1);
	    f.add(s2);
	    f.add(s3);
	    
	    f. setLayout(null);
	    f.setSize(300,300);
	    f.setVisible(true);
	    
	    
	    
	}

	public static void main(String[] args)
	{
	   new ScrollBar1();

	}

	
}
