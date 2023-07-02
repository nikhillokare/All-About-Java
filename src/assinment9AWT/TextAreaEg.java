package assinment9AWT;
import java.awt.*;

public class TextAreaEg 
{
	TextAreaEg()
	{
		Frame f = new Frame();
		TextArea t = new TextArea("Welcome to java");
		t.setBounds(100,100,600,500);
		f.add(t);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		new TextAreaEg();

	}

}
