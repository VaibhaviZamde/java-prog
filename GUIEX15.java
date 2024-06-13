import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class GUIEX15 extends JFrame implements ActionListener,Runnable,ChangeListener
{
	private JButton btn;
	private Canvas cn;
	private JLabel lbl;
	private JProgressBar pb;
	private JPanel pnl;
	private Random rn;

	public GUIEX15()
	{
		setTitle("Progress Bar");
		
		btn = new JButton("START");
		btn.addActionListener(this);
		cn = new Canvas();
		pnl = new JPanel();
		lbl = new JLabel("0%",JLabel.CENTER);
		pb = new JProgressBar(SwingConstants.HORIZONTAL,0,100);
		pb.addChangeListener(this);
		rn = new Random();
		
		setLayout(new BorderLayout());
		
		add(btn, BorderLayout.NORTH);
		add(cn, BorderLayout.CENTER);
		add(pnl, BorderLayout.SOUTH);
		pnl.setLayout(new GridLayout(2,1));
		pnl.add(lbl);
		pnl.add(pb);
		
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void run()
	{
		try
		{
			Graphics g = cn.getGraphics();
			for(int i=1;i<=100;i++)
			{
				int x = rn.nextInt(400);
				int y = rn.nextInt(400);
				int z = rn.nextInt(60);
				
				float red = rn.nextFloat();
				float green = rn.nextFloat();
				float blue = rn.nextFloat();
				Color clr = new Color(red,green,blue);
				
				g.setColor(clr);
				g.fillOval(x, y, z, z);
				pb.setValue(i);
				Thread.sleep(100);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Thread tr = new Thread(this);
		tr.start();
	}
	
	public void stateChanged(ChangeEvent ce)
	{
		double p = pb.getPercentComplete()*100;
		lbl.setText(((int)p) + "%");
	}

	public static void main(String args[])
	{
		GUIEX15 g  = new GUIEX15();
	}
}
