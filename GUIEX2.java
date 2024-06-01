import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class GUIEX2 extends JFrame implements ActionListener
{
	private JTextField t1, t2;
	private JButton fact;
	private JLabel l1,l2;

	public GUIEX2()
	{
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t2.setEditable(false);
		l1 = new JLabel("Enter Num ");
		//l2 = new JLabel("Factorial is ");
		fact = new JButton("Factorial ");
		fact.addActionListener(this);
		
		setLayout(new GridLayout(2,2));
		
		add(l1);
		add(t1);
		add(fact);
		add(t2);
	
		setTitle("Factorial");
		setSize(400,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int n = Integer.parseInt(t1.getText());
		int f =1;
		
		for(int i=1 ; i<=n; i++)
		{
			f = i*f;
		}	
		
		t2.setText(f+" ");	
		
	}

	public static void main(String args[])
	{
		GUIEX2 g = new GUIEX2();
	}
}
