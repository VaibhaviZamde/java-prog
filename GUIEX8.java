import javax.swing.*;
import java.awt.*;

class GUIEX8 extends JFrame
{
	JSplitPane sp ;
	JLabel l1,l2;
	JScrollPane s1 , s2;
	ImageIcon i1,i2;

	public GUIEX8()
	{
		setTitle("Split pane");
		
		i1 = new ImageIcon("/home/vaibhavi/Downloads/image.png");
		l1 = new JLabel(i1);
		s1 = new JScrollPane(l1);
		
		i2 = new ImageIcon("/home/vaibhavi/Downloads/image.png");
		l2 = new JLabel(i2);
		s2 = new JScrollPane(l2);
		
		sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,s1,s2);
		add(sp,BorderLayout.CENTER);
		
		sp.setDividerLocation(300);
		sp.setDividerSize(1);
		
		setVisible(true);
		setSize(500,200);
	}

	public static void main(String args[])
	{
		GUIEX8 g = new GUIEX8();
	}
}
