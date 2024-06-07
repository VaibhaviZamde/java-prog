import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIEX10 extends JFrame implements ActionListener
{
	private JLabel l1,l2,l3,l4;
	private JTextField t1,t2;
	private JButton btn;
	private JPasswordField pwd;

	public GUIEX10()
	{
		setTitle("Login");
		
		l1 = new JLabel("Login Here");
		l2 = new JLabel("UserId");
		l3 = new JLabel("Password");
		l4 = new JLabel("");
		t1  = new JTextField(10);
		pwd = new JPasswordField(10);
		btn = new JButton("Login");
		t2 = new JTextField(10);
		t2.setEditable(false);
		
		setLayout(new GridLayout(4,2));
		
		add(l1);
		add(l4);
		add(l2);
		add(t1);
		add(l3);
		add(pwd);
		add(btn);
		add(t2);
		
		btn.addActionListener(this);
		
		setVisible(true);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String user = t1.getText();
		char pass[] = pwd.getPassword();
		String password = new String(pass);
		
		if(user.equals("Vebz") && password.equals("123"))
		{
			t2.setForeground(Color.GREEN);
			t2.setText("Valid User");
		}
		else
		{
			t2.setForeground(Color.RED);
			t2.setText("Invalid User");
		}
	}

	public static void main(String args[])
	{
		GUIEX10 g = new GUIEX10();
	}
}
