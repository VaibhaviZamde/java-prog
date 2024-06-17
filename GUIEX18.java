import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIEX18 extends JFrame implements ActionListener
{
	private JPanel p1 , p2 ;
	private JTabbedPane tp;
	private JTextField t1,t2,t3,t4,t5;
	private JLabel l1,l2,l3,l4;
	private JButton b1,b2;
	
	public GUIEX18()
	{
		setTitle("Multiple Tab");
		
	//Sum
		p1 = new JPanel();
		l1 = new JLabel("Enter 1st No ");
		l2 = new JLabel("Enter 2nd No ");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		b1 = new JButton("Sum");
		b1.addActionListener(this);
		t3 = new JTextField(10);
		t3.setEditable(false);
		
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(b1);
		p1.add(t3);
		
	//Factorial
		p2 = new JPanel();
		l3 = new JLabel("Enter any No ");
		t4 = new JTextField(10);
		b2 = new JButton("Factorial");
		b2.addActionListener(this);
		t5 = new JTextField(10);
		t5.setEditable(false);
		
		p2.add(l3);
		p2.add(t4);
		p2.add(b2);
		p2.add(t5);
	
	//Tab
		tp = new JTabbedPane();
		tp.addTab("Sum",p1);
		tp.addTab("Factorial",p2);
		
		add(tp,BorderLayout.CENTER);
		
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae)
	{
		
	}

	public static void main(String args[])
	{
		GUIEX18 g = new GUIEX18();
	}
}	
