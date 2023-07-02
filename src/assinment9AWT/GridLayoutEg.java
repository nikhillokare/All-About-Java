package assinment9AWT;
import java.awt.*;
import javax.swing.*;
public class GridLayoutEg 
{
	GridLayoutEg()
	{
		JFrame f =  new JFrame();
		JButton b1 = new JButton("A");
		JButton b2 = new JButton("B");
		JButton b3 = new JButton("C");
		JButton b4 = new JButton("D");
		JButton b5 = new JButton("E");
		JButton b6 = new JButton("F");
		JButton b7 = new JButton("G");
		JButton b8 = new JButton("H");
		JButton b9 = new JButton("I");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		
		//f.setLayout(new FlowLayout());
		f.setLayout(new GridLayout(2,3));
		f.setSize(300,300);
		f.setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		new GridLayoutEg();

	}

}
