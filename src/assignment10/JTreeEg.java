package assignment10;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeEg
{
	JFrame f;
	JTreeEg()
	{
		f = new JFrame("JTree OF BGMI");
		
		DefaultMutableTreeNode AssaultRifle = new DefaultMutableTreeNode("Assault Rifle");
		DefaultMutableTreeNode M416  = new DefaultMutableTreeNode("M416");
		DefaultMutableTreeNode AKM = new DefaultMutableTreeNode("AKM");
		AssaultRifle.add(M416);
		AssaultRifle.add(AKM);
		
		DefaultMutableTreeNode m1 =  new DefaultMutableTreeNode("Long Range");
		DefaultMutableTreeNode m2  = new DefaultMutableTreeNode("5.56 Ammo");
		DefaultMutableTreeNode m3  = new DefaultMutableTreeNode("OpGun");
		DefaultMutableTreeNode m4  = new DefaultMutableTreeNode("M46xOP");
		M416.add(m1);
		M416.add(m2);
		M416.add(m3);
		M416.add(m4);
		
		DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("Close Range");
		DefaultMutableTreeNode a2  = new DefaultMutableTreeNode("7.62 Ammo");
		DefaultMutableTreeNode a3  = new DefaultMutableTreeNode("OP");
		AKM.add(a1);
		AKM.add(a2);
		AKM.add(a3);
	    
	    JTree jt = new JTree(AssaultRifle);
	    f.add(jt);
	    f.setSize(300,300);
	    f.setVisible(true);
	    f.setLayout(null);
		
		
	}
	
       public static void main(String[] args)
	{
		new JTreeEg();

	}

}
