package assinment9AWT;
import java.awt.*;

public class Login 
{

	public static void main(String[] args) 
	{
		Frame f = new Frame("MyLogin");
		Label l1 = new Label("Username");
		Label l2 = new Label("Password");
		
		TextField t1 = new TextField("");	
		TextField t2 = new TextField("");
		
		Button b1 = new Button("Ok");
		Button b2 = new Button("Cancel");
		
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		
		l1.setBounds(50,100,100,30);
		l2.setBounds(50,150,100,30);
		t1.setBounds(200,100,100,30);
		t2.setBounds(200,150,100,30);
		b1.setBounds(80,200,100,30);
		b2.setBounds(200,200,100,30);
		
		l1.setBackground(Color.red);
		l2.setBackground(Color.pink);
		f.setBackground(Color.YELLOW);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

}
