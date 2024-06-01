import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIEX4 extends JFrame implements ActionListener
{
	private JTextField t1 ,t2;
	private JLabel l1,l2;
	private double farh;
	
	public GUIEX4()
	{
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t2.setEditable(false);
		l1 = new JLabel("Celesius : ");
		l2 = new JLabel("Fahrenhit : ");
		t1.addActionListener(this);
		
		setLayout(new GridLayout(2,2));
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		
		setTitle("Temperature Convert");
		setSize(400,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			double cel = Double.parseDouble(t1.getText());
			farh = (cel * 9/5)+32;
			
			t2.setText(farh+" ");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	

	public static void main(String args[])
	{
		GUIEX4 g = new GUIEX4();
	}
}
