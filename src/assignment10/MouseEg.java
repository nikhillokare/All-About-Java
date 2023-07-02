package assignment10;
import java.awt.*;
import java.awt.event.*;

public class MouseEg extends Frame implements MouseListener
{
	Label l;
	MouseEg()
	{
		addMouseListener(this);
		l = new Label();
		l.setBounds(60,50,100,100);
		add(l);
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		new MouseEg();

	}

    @Override
	public void mouseClicked(java.awt.event.MouseEvent e) 
	{
          l.setText("Nikhil");

	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		 l.setText("aniket");
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		 l.setText("komal");
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		 l.setText("sushil");
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		 l.setText("prajkta");
		
	}

	
}
