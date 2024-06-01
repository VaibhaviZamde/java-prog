import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIEX1 extends JFrame implements ActionListener
{
	private JTextField t1;
	private JLabel l1;
	private JButton b1;
	private int count =0;

	public GUIEX1()
	{
		super("Sample");
		
		t1 = new JTextField(10);
		l1 = new JLabel("Counter");
		b1 = new JButton("Count");
		
		b1.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(l1);
		add(t1);
		add(b1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		++count;
		t1.setText(count + " ");
	}

	public static void main(String args[])
	{
		GUIEX1 g = new GUIEX1();
		
		g.setVisible(true);
		g.setSize(400,300);
		
	}
}


