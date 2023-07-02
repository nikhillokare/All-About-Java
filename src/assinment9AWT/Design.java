package assinment9AWT;
import java.awt.*;


public class Design
{
	
	Design()
	{
		Frame f = new Frame("Login");
		Checkbox c = new Checkbox("Do You Want Remember The Password");
		Label l1 = new Label("Usename");
		Label l2 = new Label("Password");
		TextField f1 = new TextField("");
		TextField f2 = new TextField("");
		Button b1 = new Button("Ok");
		Button b2 = new Button("Cancel");
		Button b3 = new Button("Forgot Password");
	
		
		f.add(c);
		f.add(l1);
		f.add(l2);
		f.add(f1);
		f.add(f2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		
		
		l1.setBounds(100,100,100,30);
		l2.setBounds(100,150,100,30);
		f1.setBounds(250,100,100,30);
		f2.setBounds(250,150,100,30);
		b3.setBounds(100,220,130,30);
		b1.setBounds(100,270,60,30);
		b2.setBounds(200,270,60,30);
		c.setBounds(100,310,250,30);
		f2.setEchoChar('*');
		
		f.setBackground(Color.pink);
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.green);
		b3.setBackground(Color.orange);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	
		
		
	}

	public static void main(String[] args) 
	{
	     
	     new Design();
        
	}
      
}
