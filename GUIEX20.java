import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

class GUIEX20 extends JFrame implements ActionListener,ListSelectionListener
{
	private JList<String> lst;
	private JTextField t1,t2,t3;
	private Vector<String> vlist;
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
		l1.setBounds(10,10,150,30);
		p2.add(l1);
		
		t1 = new JTextField(10);
		t1.setBounds(165,10,150,30);
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
		l1.setBounds(10,80,150,30);
		p2.add(l2);
		
		t2 = new JTextField(10);
		t2.setBounds(165,80,150,30);
		p2.add(t2);
		t2.setEditable(false);
		
		JLabel l3 = new JLabel("Selected Item");
		l1.setBounds(10,1150,150,30);
		p2.add(l3);
		
		t3 = new JTextField(10);
		t3.setBounds(165,115,150,30);
		p2.add(t3);
		t2.setEditable(false);
		
		lbl = new JLabel();
		lbl.setBounds(10,150,300,50);
		p2.add(lbl);
		
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
		lbl.setText("");
		String stud_name = t1.getText().trim().toUpperCase();
		t1.setText("");
		
		if(stud_name.length() >0)
		{
			String cmd = ae.getActionCommand().toUpperCase();
			
			switch(cmd)
			{
				case "ADD":
					if(vlist.contains(stud_name) == false)
					{
						vlist.add(stud_name);
						lst.setListData(vlist);
						lbl.setForeground(Color.GREEN);
						
						lbl.setText(stud_name+" ");
					}
					else
					{
						lbl.setForeground(Color.RED);
						lbl.setText(stud_name+" is already added");
					}
					break;
					
				case "REMOVE":
					int Index = vlist.indexOf(stud_name);
					
					if(Index != -1)
					{
						vlist.remove(Index);
						lst.setListData(vlist);
						lbl.setForeground(Color.GREEN);
						lbl.setText(stud_name+" is removed");
					}
					else
					{
						lbl.setForeground(Color.RED);
						lbl.setText(stud_name+" is not found");
					}
					break;
			}
		}
		else
		{
			lbl.setForeground(Color.RED);
			lbl.setText("Invalid Student Name");
		}
	}
	
	public void valueChanged(ListSelectionEvent e)
	{
		int i = lst.getSelectedIndex();
		String n = (String) lst.getSelectedValue();
		t2.setText(i+" ");
		t3.setText(n);
	}

	public static void main(String args[])
	{
		GUIEX20 g = new GUIEX20();
	}
}
