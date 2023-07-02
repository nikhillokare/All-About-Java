package assinment9AWT;
import java.awt.*;

public class ButtonDemo
{

	public static void main(String[] args) 
	{
	        Frame f = new Frame("Button example");
	        Button b = new Button("Click Here");
	        f.setLayout(null);
	        b.setBounds(100,100,200,100);
	        f.add(b);
	        f.setSize(300,300);
	        f.setVisible(true);
	        
	       
	}

}
