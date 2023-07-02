package assinment9AWT;
import java.awt.*;

public class Demo1 
{

	public static void main(String[] args) 
	{
		Frame f = new Frame("Profound");
		Label l1 = new Label("Session");
		Label l2 = new Label("Practical");
		f.add(l1);
		f.add(l2);
		l1.setBounds(50,100,100,30);
		l2.setBounds(50,150,100,30);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
		
		

	}

}
