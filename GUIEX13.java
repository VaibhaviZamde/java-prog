import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIEX13 extends JFrame implements ActionListener
{
	private JLabel l;

	public GUIEX13()
	{
		setTitle("Choose Color");
		
		l = new JLabel("SGGS");
		l.setFont(new Font("Times New Roman",Font.BOLD,22));
		
		JButton b = new JButton("Select Color");
		b.addActionListener(this);
		
		setLayout(new GridLayout(1,1));
		
		add(l);
		add(b);
		
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Color clr = JColorChooser.showDialog(this,"Text Color",Color.PINK);
		l.setForeground(clr);
	}	

	public static void main(String args[])
	{
		GUIEX13 g = new GUIEX13();
	}
}
