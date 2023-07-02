package assinment9AWT;
import java.awt.*;
public class CkeckBoxDemo  
{

	public static void main(String[] args) 
	{
		Frame f = new Frame("Pubg State");
		Checkbox ch1 = new Checkbox("M416");
		Checkbox ch2 = new Checkbox("M762");
		f.add(ch1);
		f.add(ch2);
		ch1.setBounds(100,100,100,100);
		ch2.setBounds(100,200,100,100);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
