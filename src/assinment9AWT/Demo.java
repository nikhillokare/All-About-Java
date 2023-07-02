package assinment9AWT;
import java.awt.*;

public class Demo 
{

	public static void main(String[] args) 
	{
		Frame f = new Frame("PUBG STATE");
		Label l1 = new Label("Assault Riffle");
		Label l2 = new Label("Sniaper Riffle:");
		Label l3 = new Label("DMR:"); 
		Label l4 = new Label("SMG:");
		Label l5 = new Label("LMG:");
		l1.setBounds(70,50,100,20);
		l2.setBounds(70,90,100,20);
		l3.setBounds(70,130,100,20);
		l4.setBounds(70,170,100,20);
		l5.setBounds(70,210,100,20);
		f.add(l1);
		f.add(l2);
        f.add(l3);
		f.add(l4);
		f.add(l5);
		Button b = new Button("submit");
		Button b1 = new Button("Clear");
		b.setBounds(150,300,100,20);
		b1.setBounds(350,300,100,20);
		f.add(b);
		f.add(b1);
		Checkbox cb = new Checkbox("M416");
		Checkbox cb1 = new Checkbox("AWM");
		Checkbox cb2 = new Checkbox("MINI14");
		Checkbox cb3 = new Checkbox("UMP45");
		Checkbox cb4 = new Checkbox("DP28");
		f.setLayout(null);
        cb.setBounds(450,50,100,20);
		cb1.setBounds(450,90,100,20);
		cb2.setBounds(450,130,100,20);
		cb3.setBounds(450,170,100,20);
		cb4.setBounds(450,170,100,100);
		f.add(cb);
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.add(cb4);
		f.setSize(800,400);
		f.setVisible(true);
		
	}


	}
		