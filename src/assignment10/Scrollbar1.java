package assignment10;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Frame;
import java.awt.Scrollbar;

public class Scrollbar1 extends Frame implements AdjustmentListener
{
    Scrollbar s1,s2,s3;
    Scrollbar1()
    {
        s1=new Scrollbar();
        s2=new Scrollbar();
        s3=new Scrollbar();

        s1.setBounds(50,50,20,100);
        s2.setBounds(100,50,20,100);
        s3.setBounds(150,50,20,100);

        add(s1);
        add(s2);
        add(s3);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setBackground(Color.darkGray);

        s1.setBackground(Color.red);
        s2.setBackground(Color.green);
        s3.setBackground(Color.blue);

        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
    }
    public static void main(String[] args) 
    {
        new Scrollbar1();


    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) 
    {
        if(e.getSource()==s1)
        {
            s1.setBackground(Color.yellow);
            setBackground(Color.red);
        }
        else if (e.getSource()==s2)
        {
            s2.setBackground(Color.yellow);
            setBackground(Color.green);
        }
        else if (e.getSource()==s3)
        {
            s3.setBackground(Color.yellow);
            setBackground(Color.blue);
        }


    }
}