package assignment10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends Frame implements ActionListener,MouseListener
{
    JTextField t1,t2;
    JButton b1,b,b2;
    Container  c;

    Login()
    {
            c=getContentPane();
            JLabel l1=new JLabel("User Name:");
            JLabel l2=new JLabel ("Password:");
            JButton b2=new JButton("Forgot Password");

            t1= new JTextField();
            t2=new JTextField();

            b1=new JButton("OK");
            b=new JButton("CANCEL");

            setLayout(null);
            
            add(l1);
            add(l2);
            add(b2);
            add(t1);
            add(t2);
            add(b1);
            add(b);
            l1.setBounds(50,100,100,30);
            l2.setBounds(50,150,100,30);
            b2.setBounds(60,250,200,30);
            t1.setBounds(200,100,100,30);
            t2.setBounds(200,150,100,30);
            b1.setBounds(60,200,100,30);
            b.setBounds(180,200,100,30);



            l1.setBackground(Color.gray);
            l2.setBackground(Color.gray);
            b1.setBackground(Color.red);
            b.setBackground(Color.red);
            b2.setBackground(Color.red);
            setBackground(Color.yellow);

            setSize(500,500);
            setVisible(true);

            b1.addActionListener(this);
            b.addMouseListener(this);
            b2.addActionListener(this);
    }
    public void addComponentsToContainer()
    {
        c.add(t2);
        c.add(t1);

    }
    private Container getContentPane() 
    {
        
        return null;
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==b1)
        {
            String userText,pwdText;
            userText=t1.getText();
            pwdText=t2.getText();

            if(userText.equalsIgnoreCase("admin") && pwdText.equalsIgnoreCase("admin@123"))
            {
                JOptionPane.showMessageDialog(this,"Login Succefull");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Login Failed");
            }

        }

    }
public static void main(String[] args) 
    {
        new Login();
    }

  
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		dispose();
		
	}
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
    }