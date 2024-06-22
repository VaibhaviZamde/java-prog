import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIEX22 extends JFrame implements ActionListener
{
	private JLabel l1,l2,l3;
	private JButton btn;
	private JTextField t1;
	private JRadioButton rb1,rb2,rb3,rb4;
	private ButtonGroup bg1,bg2;
	
	public GUIEX22()
	{
		setTitle("Radio Button");
		setLayout(new GridLayout(4,3));
		
		l1 = new JLabel("Enter Student Name : ");
		l2 = new JLabel("Select Gender ");
		l3 = new JLabel("Select Nationality");
		
		t1 = new JTextField(40);
		
		rb1 = new JRadioButton("Male");
		rb2 = new JRadioButton("Female");
		rb3 = new JRadioButton("Indian");
		rb4 = new JRadioButton("Other");
		bg1 = new ButtonGroup();
		bg2 = new ButtonGroup();
		
		btn = new JButton("Submit");
		btn.addActionListener(this);
		
		bg1.add(rb1);
		bg1.add(rb2);
		bg2.add(rb3);
		bg2.add(rb4);
		
		add(l1);
		add(t1);
		add(new JLabel(""));
		add(l2);
		add(rb1);
		add(rb2);
		add(l3);
		add(rb3);
		add(rb4);
		add(btn);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400,200);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String n = t1.getText().trim().toUpperCase();
		String gen = null;
		
		if(rb1.isSelected())
		{
			gen = "Male";
		}
		else
		{
			if(rb1.isSelected())
				gen = "Female";
		}
		
		String nat = null;
		
		if(rb3.isSelected())
		{
			nat = "Indian";
		}
		else
		{
			if(rb4.isSelected())
				nat = "Other";
		}
		
		JOptionPane.showMessageDialog(this,"Name = "+n+"\nGender = "+gen+"\nNationality = "+nat);	
	}
	
	public static void main(String args[])
	{
		GUIEX22 g = new GUIEX22();
	}
}
