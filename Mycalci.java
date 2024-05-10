import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Mycalci extends JFrame implements ActionListener
{
	JLabel num1,num2,res;
	JTextField t1,t2,t3;
	JButton addition;
	
	public Mycalci()
	{
		super("Calculator");
		
		num1 = new JLabel("Enter 1st Number");
		num2 = new JLabel("Enter 2nd Number");
		res = new JLabel("Result");
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t3.setEditable(false);
		addition = new JButton("Add");
		addition.addActionListener(this);
		
		setLayout(new FlowLayout(20,10,10));
		
		add(num1);
		add(t1);
		add(num2);
		add(t2);
		add(addition);
		add(t3);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());
		double res = 0;
		
		String cap = e.getActionCommand();
		
		if(cap.equals("Add"))
		{
			res = n1+n2;
		}
		else
		{
			res = 0;
		}
		
		t3.setText(res+"");
	}

	public static void main(String args[]) 
	{
		Mycalci cal = new Mycalci();
		cal.setVisible(true);
		cal.setSize(400,400);
	}
	
}

















