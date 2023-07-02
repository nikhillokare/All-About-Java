package assignment10;
import java.awt.*;
import java.awt.event.*;

public class KeyEvent extends Frame implements KeyListener
{
	Label l ;
	TextArea area;
	
	KeyEvent()
	{
		l = new Label();
		l.setBounds(60,50,40,40);
		area = new TextArea();
		area.setBounds(20,80,300,300);
		area.addKeyListener(this);
		
		add(l);
		add(area); 
		setSize(300,300);
		setVisible(true);
		setLayout(null);
	}
	
	

	public static void main(String[] args) 
	{
		new KeyEvent();
	}

	@Override
	public void keyTyped(java.awt.event.KeyEvent e) 
	{
		area.setText("Key Typed");
		
	}

	@Override
	public void keyPressed(java.awt.event.KeyEvent e) 
	{
		
		area.setText("Key Pressed");
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) 
	{
		area.setText("Key Relesaed");
		
	}

}
