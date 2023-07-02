package assignment10;
import java.awt.*;
import java.awt.event.*;

public class MouseEvent extends Frame implements MouseListener
{
	Label l;
	MouseEvent()
	{
		addMouseListener(this);
		l = new Label();
		l.setBounds(50,50,100,20);
		add(l);
		
		setSize(300,300);
		setVisible(true);
		setLayout(null);
	}
	
	public static void main(String[] args) 
	{
		new MouseEvent();

	}
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		
		l.setText("Mouse Clicked");
	}
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		
		l.setText("Mouse Pressed");
		
	}
	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		
		l.setText("Mouse Released");
	}
	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		
		l.setText("Mouse Entered");
	}
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		l.setText("Mouse Exited");
		
	}

}
