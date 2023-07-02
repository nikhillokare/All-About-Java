package assignment10;
import java.awt.*;
import java.awt.event.*;

public class FocusEg extends Frame implements FocusListener
{
    TextField t1,t2,t3;
	
	FocusEg()
	{
		
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		
		t1.setBounds(50,50,60,30);
		t2.setBounds(140,50,60,30);
		t3.setBounds(140,100,60,30);
		
		t2.setBackground(Color.yellow);
		t3.setBackground(Color.yellow);
		
		add(t1);
		add(t2);
		add(t3);
		
		t1.addFocusListener(this);
		
		setBackground(Color.pink);
		setLayout(null);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new FocusEg();
	}

	@Override
	public void focusGained(FocusEvent e) 
	{
		   TextField t1=(TextField)e.getSource();
	       t1.setBackground(Color.green);
	       
	}

	@Override
	public void focusLost(FocusEvent e) 
	{
		 TextField t1=(TextField)e.getSource();
	       t1.setBackground(Color.black);
	     
	}

}
