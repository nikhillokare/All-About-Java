package CollectionAndGenerics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;


public class GUI extends JFrame implements ActionListener
{
	ArrayList<Employee> emplist;
	JFrame f;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	JTextArea  t5;
	JButton b1;
	JButton b2;
	JButton b3;
	Container c;
	GUI()
	{
		 emplist=new ArrayList<Employee>();
		 f = new JFrame("Information");
		 l1 = new JLabel("ID");
		 l2 = new JLabel("Name");
	     l3 = new JLabel("Basic");
		 c = getContentPane();
		
		 t1  =  new JTextField();
		 t2  =  new JTextField();
		 t3  =  new JTextField();
		 t4  =  new JTextField();
		 t5  =  new JTextArea();
		
		 b1  =  new JButton("Add");
		 b2  =  new JButton("List All");
		 b3  =  new JButton("Search");
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		
		
		l1.setBounds(50,50,40,30);
		l2.setBounds(50,80,60,50);
		l3.setBounds(50,120,60,50);
		t1.setBounds(100,50,100,30);
		t2.setBounds(100,90,100,30);
		t3.setBounds(100,130,100,30); 
	    b1.setBounds(50,180,80,30);
	    b2.setBounds(140,180,80,30);
	    b3.setBounds(50,500,100,30);
	    t4.setBounds(160,500,120,30);
	    t5.setBounds(50,230,250,250);
	    
	    f.setSize(300,300);
	    f.setLayout(null);
	    f.setVisible(true);
	    
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);
	    
	}
	    public void addComponentsToContainer()
	    {
	    	c.add(t1);
	    	c.add(t2);
	    	c.add(t3);
	    	c.add(t4);
	    	c.add(t5);
	    }
	    
	    
	    
	public static void main(String[] args) 
	{
		new GUI(); 

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		  if(e.getSource()==b1 )
	        {
	    	    int idText,basicText;
	            String nameText;
	            idText=Integer.parseInt(t1.getText());
	            nameText=t2.getText();
	            basicText=Integer.parseInt(t3.getText());
	            Employee emp=new Employee(idText,nameText,basicText);
	            emplist.add(emp);
	            t5.setText(emp.toString());
	            
	        } 
	         else if(e.getSource()==b2 )
	        {	
	    	   String s="";
	    	   Iterator<Employee> itr=emplist.iterator();
	    	   while(itr.hasNext())
	    	   {
	    		   Employee ee=itr.next();
	    		   s=s + ee.toString()+"\n";
	    		   t5.setText(s);
	    	   }
	       }
	         else if(e.getSource()==b3 )
            {
  	           String selectText=t4.getText();
  	           Iterator<Employee> itr=emplist.iterator();
  	           while(itr.hasNext())
  	        {
  		   
  		   Employee ee=itr.next();
  		   if(ee.getId()==Integer.parseInt(selectText))
  		   {
  			   t5.setText(ee.toString());
  		   }
  		   else
  		   {
  			   t5.setText("Record Not Found");
  		   }
  		   
  		   
  	   }
     }
  	   
  	
      
  
	}
}

	