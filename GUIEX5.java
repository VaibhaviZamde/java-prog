import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class GUIEX5 extends JFrame implements ActionListener
{
	private JTextField t1,t2,t3;
	private JLabel l1,l2,l3;
	private double sd , euros = 0;

	public GUIEX5()
	{
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t2.setEditable(false);
		t3 = new JTextField(10);
		t3.setEditable(false);
		l1 = new JLabel("Dollars : ");
		l2 = new JLabel("Singapure Dollars : ");
		l1 = new JLabel("Euros : ");
		
		t1.addActionListener(this);
		//.addActionListener(this);
		
		setLayout(new GridLayout(3,2));
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		
		setTitle("Temperature Convert");
		setSize(400,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
	}

	public static void main(String args[])
	{
		GUIEX5 G = new GUIEX5();
	}
}
