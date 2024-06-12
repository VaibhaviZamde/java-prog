import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

class GUIEX14 extends JFrame implements ChangeListener
{
	JLabel l ;
	JSlider js;
	
	public GUIEX14()
	{
		setTitle("Slider");
		
		l = new JLabel("SGGS NANDED");
		l.setFont(new Font("Gabriola",Font.BOLD,22));
		add(l,BorderLayout.CENTER);
		setLayout(new GridLayout(1,1));
		
		js = new JSlider(JSlider.HORIZONTAL,0,100,0);
		add(js,BorderLayout.CENTER);
		
		js.setPaintTicks(true);
		js.setMinorTickSpacing(1);
		js.setMajorTickSpacing(10);
		js.setPaintLabels(true);
		js.addChangeListener(this);
		
		setVisible(true);
		setSize(300,300);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void stateChanged(ChangeEvent e)
	{
		int current_value = js.getValue();
		l.setFont(new Font("Gabriola",Font.BOLD,current_value));
	}

	public static void main(String args[])
	{
		GUIEX14 g = new GUIEX14();
	}
}
