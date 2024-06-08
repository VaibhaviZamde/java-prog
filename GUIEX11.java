import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIEX11 extends JFrame implements ActionListener
{
	private JTextArea ta;
	private JButton cut , copy,paste;

	public GUIEX11()
	{
		setTitle("TextArea");
		
		cut = new JButton("CUT");
		copy = new JButton("COPY");
		paste = new JButton("PASTE");
		ta = new JTextArea(5,20);
		ta.setFont(new Font("Gabriola",Font.BOLD,22));
		JScrollPane sp = new JScrollPane(ta);
		JLabel l1 = new JLabel("");
		JLabel l2 = new JLabel("");
		
		add(cut);
		add(copy);
		add(paste);
		add(sp);
		add(l1);
		add(l2);
		
		setLayout(new GridLayout(2,2));
		
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String cmd = e.getActionCommand();
		
		switch(cmd)
		{
			case "CUT" : ta.cut(); break;
			case "COPY" : ta.copy(); break;
			case "PASTE" : ta.paste(); break;	
		}
	}

	public static void main(String args[])
	{
		GUIEX11 g = new GUIEX11();
	}
}
