package mypack;
import java.awt.*;

public class AWT 
{
	AWT()
	{
		Frame f = new Frame("Login Form");
		Label l1 = new Label("User:");
		Label l2 = new Label("Password:");
		TextField t1 = new TextField();
		TextField t2 = new TextField('*');
		Button b1 = new Button("Login");
		Button b2 = new Button("Cancel");
		Checkbox c = new Checkbox("Do You Remember Your Password");
		
		l1.setBounds(50,50,60,20);
		l2.setBounds(50,80,60,20);
		t1.setBounds(150,50,90,30);
		t2.setBounds(150,80,90,30);
		b1.setBounds(50,120,60,30);
		b2.setBounds(120,120,60,30);
		c.setBounds(80,180,100,30);
		
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(c);
		
		f.setBackground(Color.yellow);
		l1.setBackground(Color.pink);
		l2.setBackground(Color.green);
		b1.setBackground(Color.orange);
		b2.setBackground(Color.red);

		t2.setEchoChar('*');
		
		f.setSize(300,300);
		f.setVisible(true);
		f.setLayout(null);
	}

	public static void main(String[] args) 
	{
		new AWT();

	}

}
