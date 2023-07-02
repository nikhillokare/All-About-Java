package assinment9AWT;
import java.awt.*;
import java.awt.event.*;

public class DialogEg 
{
	private static Dialog d;
	DialogEg()
	{
		Frame f= new Frame();
	    d = new Dialog(f,"Dialog Window",true);
		Button b = new Button("Click On This");
		d.setLayout(new FlowLayout());
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent a)
			{
				DialogEg.d.setVisible(false  );
			}
		});
		d.add(new Label("Click On This Button"));
		d.add(b);
		d.setSize(200,200);
		d.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new DialogEg();

	}

}
