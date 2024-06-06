import javax.swing.*;
import java.awt.*;

class GUIEX7 extends JFrame 
{
	private JLabel lbl;
	private JScrollPane  sp;
	private ImageIcon img;	
	
	public GUIEX7()
	{
		setTitle("Scroll Image");
		
		img = new ImageIcon("/home/vaibhavi/Downloads/image.png");
		lbl = new JLabel(img);
		sp = new JScrollPane(lbl);
		
		add(sp,BorderLayout.CENTER);
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String args[])
	{
		GUIEX7 g = new GUIEX7();
	}
}
