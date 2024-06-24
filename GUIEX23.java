import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIEX23 extends JFrame implements ItemListener
{

	private JComboBox <String> cb;

	public GUIEX23()
	{
		setTitle("Combo Box");
		setLayout(new FlowLayout());
		
		add(new JLabel("Select Color"));
		
		String arr[] ={"RED","BLUE","PINK","BLACK"};
		cb = new JComboBox <String> (arr);
		add(cb);
		cb.addItemListener(this);
		
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		String clr = (String) cb.getSelectedItem();
		Graphics g =  this .getGraphics();
		
		switch(clr)
		{
			case "RED":
				g.setColor(Color.RED);
				break;
			
			case "BLUE":
				g.setColor(Color.BLUE);
				break;
				
			case "PINK":
				g.setColor(Color.PINK);
				break;
				
			case "BLACK":
				g.setColor(Color.BLACK);
				break;
		}
		g.fillRect(100,150,300,300);
	}
	
	public static void main(String args[])
	{
		GUIEX23 g = new GUIEX23();
	}
}
