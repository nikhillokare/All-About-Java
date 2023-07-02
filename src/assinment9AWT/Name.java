package assinment9AWT;
import java.awt.*;

public class Name extends Frame
{
	public Name()
	{
		Frame f = new Frame();
		Label l = new Label("Profound Edutech");
		l.setForeground(Color.blue);
		f.setBackground(Color.pink);
		Font boldFont = new Font("Arial",Font.BOLD, 80);
		l.setFont(boldFont);
        l.setBounds(250,50,700,600);
		f.add(l);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	 
	
	public static void main(String[] args) 
	{
		new Name();

	}

}
