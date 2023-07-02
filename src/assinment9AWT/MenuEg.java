package assinment9AWT;
import java.awt.*;

public class MenuEg 
{
	MenuEg()
	{
		Frame f = new Frame("MenuBar");
		MenuBar mb = new MenuBar();
		Menu  m = new Menu("5.56"); 
		Menu  sub = new Menu("7.56"); 
		
		MenuItem m1 = new MenuItem("M416");
		MenuItem m2 = new MenuItem("Scar-l");
		MenuItem m3 = new MenuItem("AUG");
		MenuItem m4 = new MenuItem("AKM");
		MenuItem m5 = new MenuItem("M762");
		
		m.add(m1);
		m.add(m2);
		m.add(m3);
		sub.add(m4);
		sub.add(m5);
		
	    mb.add(m);
		m.add(sub);
		
		f.setMenuBar(mb);
		f.setSize(300,300);
		f.setVisible(true);
		
		
		
	}

	public static void main(String[] args) 
	{
	     new MenuEg();
	}

}
