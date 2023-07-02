package assignment10;
import java.awt.*;
import java.awt.event.*;


public class AEventEg extends Frame implements ActionListener
{
	TextField tf;
	AEventEg()
	{
		
		tf = new TextField();
		tf.setBounds(60,50,170,20);
		Button b = new Button("Click mi");
		b.setBounds(100,120,80,30);
		
		b.addActionListener(this);
		add(tf);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) 
	{
		new AEventEg();

	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		tf.setText("Welcome");
		
	}
	
}
