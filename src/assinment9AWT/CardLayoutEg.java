  package assinment9AWT;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CardLayoutEg extends JFrame implements ActionListener
{
	CardLayout card;
	Container c;
	JButton b1,b2,b3;
	CardLayoutEg()
	{
		c = getContentPane();
		 card = new CardLayout(20,20);
		c.setLayout(card);
		
		JButton b1 = new JButton("M416");
		JButton b2 = new JButton("AKM");
		JButton b3 = new JButton("M762");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		c.add("a",b1);
		c.add("b",b2);
		c.add("c",b3);
		
	}
	
	
	public static void main(String[] args)
    {
		CardLayoutEg c = new CardLayoutEg();
		c.setSize(300,300);
		c.setVisible(true);
		c.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	   {
		card.next(c);
	   }
	
}
