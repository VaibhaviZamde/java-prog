import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIEX6 extends JFrame
{
	public GUIEX6()
	{
		ImageIcon img = new ImageIcon("/home/vaibhavi/Downloads/image.png");
		
		JLabel lab = new JLabel("SEA");
		JLabel l = new JLabel(img);
		lab.setHorizontalAlignment(JLabel.CENTER);
		add(lab);
		add(l);
		
		setLayout(new GridLayout(2,1));
		
		setTitle("ImageIcon");
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[])
	{
		GUIEX6 g = new GUIEX6();		
	}
}
