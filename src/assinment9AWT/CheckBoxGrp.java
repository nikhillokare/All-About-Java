package assinment9AWT;
import java.awt.*;

public class CheckBoxGrp 
{
	CheckBoxGrp()
	{
		Frame f = new Frame("BGMI");
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox ch11 = new Checkbox("Sniper",cbg,true);
		Checkbox ch12 = new Checkbox("Assault",cbg,true);
		ch11.setBounds(100,100,200,100);
		ch12.setBounds(100,200,200,100);
		f.add(ch11);
		f.add(ch12);
		f.setSize(300,300);
		f.setLayout(null);
	    f.setVisible(true);
	 }

	public static void main(String[] args)
	{
		new CheckBoxGrp();
	}

}
