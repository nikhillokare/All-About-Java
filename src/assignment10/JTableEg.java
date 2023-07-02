  package assignment10;
import javax.swing.*;
import javax.swing.JFrame.*;

public class JTableEg extends JFrame
{
	JTableEg()
	{
		String[] coloumns = new String[]
				{
					"Id","Name","HourlyRate","PartTime"
				};
		            Object [][] data = new Object[][]
				{
			         {1,"Nikhil",40.0,false},
			         {2,"Nik",60.0,false},
			         {3,"Nikkk",70.0,true},
				};
				
				JTable table = new JTable(data,coloumns);
				
				this.add(new JScrollPane(table));
				this.setTitle("Table Example");
				this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				this.pack();
				this.setVisible(true);
				
	}

	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable()
				{
			        public void run()
			        {
			        	new JTableEg();
			        }
				
		
	             });

      }
}	
	
