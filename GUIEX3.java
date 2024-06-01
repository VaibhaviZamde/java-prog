import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIEX3 extends JFrame implements ActionListener
{
	private JTextField t1,t2;
	private JLabel l1,l2;
	private int sum  = 0;

	public GUIEX3()
	{
		l1 = new JLabel("Enter Integer ");
		l2 = new JLabel("The accumulated sum is ");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t2.setEditable(false);
		t1.addActionListener(this);
		
		setLayout(new FlowLayout(2));
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		
		setTitle("Accumulator");
		setSize(300,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ex)
	{
		try
		{
			int num = Integer.parseInt(t1.getText());
			sum += num;
			t1.setText(" ");
			t2.setText(sum + " ");
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}	
	}
	
	public static void main(String args[])
	{
		GUIEX3 g = new GUIEX3();
	}
}
