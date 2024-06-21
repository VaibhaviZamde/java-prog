import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIEX21 extends JFrame implements ActionListener
{
	private JCheckBox jc1,jc2,jc3;
	private JTextField t1;
	private JLabel l1;
	
	public GUIEX21()
	{
		setTitle("Check Box ");
		setLayout(new GridLayout(6,1));	
		
		l1 = new JLabel("Select Your Fvr Lang.");
		add(l1);
		
		jc1 = new JCheckBox("JAVA");
		jc1.addActionListener(this);
		jc2 = new JCheckBox("PYTHON");
		jc2.addActionListener(this);
		jc3 = new JCheckBox("C ");
		jc3.addActionListener(this);
		
		t1 = new JTextField(10);
		add(t1);
		t1.setEditable(false);
		
		add(jc1);
		add(jc2);
		add(jc3);
		
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String cmd = e.getActionCommand();
		t1.setText(cmd+" is selected");	
	}
	
	public static void main(String args[])
	{
		GUIEX21 g = new GUIEX21();
	}
}


