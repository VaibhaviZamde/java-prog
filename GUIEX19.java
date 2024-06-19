import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SumFrame extends JInternalFrame implements ActionListener
{
	private JTextField t1,t2,t3;
	private JLabel l1,l2;
	private JButton b1;
	
	public SumFrame()
	{
		super("Sum",true,true,true,true);
		setLayout(new GridLayout(3,2));
		
		l1 = new JLabel("Enter 1st No ");
		l2 = new JLabel("Enter 2nd No ");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		b1 = new JButton("Sum");
		b1.addActionListener(this);
		t3 = new JTextField(10);
		t3.setEditable(false);
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		//add(l1);
		add(b1);
		add(t3);
		
		setVisible(true);
		setSize(200,200);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());
		
		int res = n1+n2;
		t3.setText(res+" ");
	}
}

class FactFrame extends JInternalFrame implements ActionListener
{
	private 	JTextField t1,t2;
	private JLabel lbl;
	private JButton btn;
	
	public FactFrame()
	{
		setTitle("Factorial");
		setLayout(new FlowLayout());
		
		lbl = new JLabel("Enter any No ");
		t1 = new JTextField(10);
		btn = new JButton("Factorial");
		btn.addActionListener(this);
		t2 = new JTextField(10);
		t2.setEditable(false);
		
		add(lbl);
		add(t1);
		add(btn);
		add(t2);
		
		setVisible(true);
		setSize(200,200);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			int n = Integer.parseInt(t1.getText());
			int f = 1;
			
			for(int i=1;i<=n;i++)
			{
				f = f*i;
			}
			
			t2.setText(f+"");
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(this,ex.toString());
		}
	}
}

class GUIEX19 extends JFrame implements ActionListener
{
	private JDesktopPane dp;
		
	public GUIEX19()
	{
		setTitle("Desktop");
			
		dp = new JDesktopPane();
		add(dp,BorderLayout.CENTER);
			
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		JMenu m = new JMenu("Frames");
		mb.add(m);
		
		String arr[] = {"SumFrame","FactFrame"};
		
		for(int i=0;i<arr.length;i++)
		{
			JMenuItem mi = new JMenuItem(arr[i]);
			m.add(mi);
			mi.addActionListener(this);
		}
			
		setVisible(true);
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String cmd = ae.getActionCommand().toUpperCase();
		
		switch(cmd)
		{
			case "SUMFRAME":
				SumFrame x = new SumFrame();
				dp.add(x);				
				break;
			
			case "FACTFRAME":
				FactFrame y = new FactFrame();
				dp.add(y);
				break;
		}
	}
	
	public static void main(String args[])
	{
		GUIEX19 g = new GUIEX19();
	}
}
