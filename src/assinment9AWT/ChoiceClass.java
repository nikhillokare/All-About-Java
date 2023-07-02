package assinment9AWT;
import java.awt.*;

public class ChoiceClass 
{
	ChoiceClass()
	{
		Frame f = new Frame("Clash Of Clan ");
		//Choice c  = new Choice();
		List c = new List(3);
		c.add("King");
		c.add("Queen");
		c.add("Gaint");
		f.add(c);
		f.setLayout(null);
		f.setVisible(true);
		//c.setBounds(100,200,100,30);
		c.setBounds(100,200,100,30);
		f.setSize(300,400);
		
		
		
	}

	public static void main(String[] args) 
	{
		new ChoiceClass();

	}

}
