import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

class GUIEX20 extends JFrame implements ActionListener
{
	private JList <String> lst;
	private JTextField t1,t2,t3;
	private Vector <String> vlist;
	private JLabel lbl;
	
	public GUIEX20()
	{
		super("List");
		
		JPanel p1 = new JPanel();
		//p1.setLayout(new BorderLayout.CENTER);
		
		vlist = new Vector <String> ();
		lst = new JList <String> (vlist);
		JScrollPane sp = new JScrollPane(lst);
		p1.add(sp,BorderLayout.CENTER);
		lst.addListSelectionListener(this);
		
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		
		JLabel l1 = new JLabel("Enter Student Name");
		l1.setBound(10,10,150,30);
		p2.add(l1);
		
		t1 = new JTextField(10);
		t1.setBound(165,10,150,30);
		p2.add(t1);
		
		JButton b = new JButton("ADD");
		b.setBounds(10,45,150,30);
		p2.add(b);
		b.addActionListener(this);
		
		b = new JButton("REMOVE");
		b.setBounds(165,45,150,30);
		p2.add(b);
		b.addActionListener(this);
		
		JLabel l2 = new JLabel("Selected Index");
		l1.setBound(10,80,150,30);
		p2.add(l2);
		
		t2 = new JTextField(10);
		t2.setBound(165,80,150,30);
		p2.add(t2);
		t2.setEditable(false);
		
		JLabel l3 = new JLabel("Selected Item");
		l1.setBound(10,1150,150,30);
		p2.add(l3);
		
		t3 = new JTextField(10);
		t3.setBound(165,115,150,30);
		p2.add(t3);
		t2.setEditable(false);
		
		lbl = new JLabel();
		lb.setBounds(10,150,300,50);
		p2.add(lb);
		
		JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
		
		jsp.setDividerLocation(200);
		jsp.setDividerLocation(2);
		add(jsp,BorderLayout.CENTER);
		
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
	}
	
	public void valueChanged(ListSelectionEvent e)
	{
	
	}

	public static void main(String args[])
	{
		GUIEX20 g = new GUIEX20();
	}
}
