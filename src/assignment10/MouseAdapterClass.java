package assignment10;
import java.awt.*;
import java.awt.event.*;

public class MouseAdapterClass extends MouseAdapter
{
	Frame f;
	MouseAdapterClass()
	{
	    f = new Frame("Mouse Adaptor");
		f.addMouseListener(this);
	    f.setSize(300,300);
	    f.setLayout(null);
		f.setVisible(true);
		
	}
	public void mouseClicked(MouseEvent e)
	{
		Graphics g = f.getGraphics();
		g.setColor(Color.blue);
		g.fillOval(e.getX(),e.getY(),30,30);
	}
	

	public static void main(String[] args) 
	{
		new MouseAdapterClass();

	}
}

