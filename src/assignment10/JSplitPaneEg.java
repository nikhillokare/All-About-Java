package assignment10;
import java.awt.FlowLayout;
import javax.swing.*;

public class JSplitPaneEg 
{
	private static void CreateAndshow() 
	{
		final JFrame frame = new JFrame("JSplitPane");
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout());
		
		String[] optional1 = {"Nikhil","Aniket","Sushil","Komal","Rutuja"};
		JComboBox box1 = new JComboBox(optional1);
		String[] optional2 = {"1","2","3","4","5"};
		JComboBox box2 = new JComboBox(optional2);
		
		JPanel panel1 = new JPanel();
		panel1.add(box1);
		JPanel panel2 = new JPanel();
		panel2.add(box2);
		
		
		JSplitPane splitpane  = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,panel1,panel2);
		frame.getContentPane().add(splitpane);
		
	}

	public static void main(String[] args) 
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				CreateAndshow();
			}
		
		});
	}

}
