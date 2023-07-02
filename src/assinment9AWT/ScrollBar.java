package assinment9AWT;
import java.awt.*;

public class ScrollBar 
{
     ScrollBar()
     {
    	 Frame f = new Frame("Nothing");
    	 Scrollbar s = new Scrollbar();
    	 f.setLayout(null);
    	 f.setBounds(100,200,300,70);
    	 f.add(s);
    	 f.setSize(300,300);
    	 f.setVisible(true);
     }
	public static void main(String[] args) 
	{
		new ScrollBar();

	}

}
