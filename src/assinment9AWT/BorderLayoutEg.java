package assinment9AWT;
import java.awt.*;
import javax.swing.*;

public class BorderLayoutEg 
{
	BorderLayoutEg()
	{
		JFrame f = new JFrame("BorderLayout");
		JButton b1 = new JButton("M762");
		JButton b2 = new JButton("M416");
		JButton b3 = new JButton("AKM");
		JButton b4 = new JButton("UZI");
		JButton b5 = new JButton("AWM");
		
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		
		//f.setLayout(new BorderLayout());
		f.setSize(300,300);
		f.setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		new BorderLayoutEg();

	}

 }
