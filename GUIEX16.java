import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

class GUIEX16 extends JFrame 
{
	private JTable tbl;
	
	public GUIEX16()
	{
		setTitle("TableCreation");
		
		String cols[] = { "Roll No. ", "Name","Department"};
		String rows[][] = { {"1","JACK","IT"} , {"2","JAMES","CSE"} , {"3","JOE","CSE"},};
		
		tbl = new JTable(rows,cols);
		
		JScrollPane jsp = new JScrollPane(tbl);
		add(jsp,BorderLayout.CENTER);
		
		JTableHeader th = tbl.getTableHeader();
		th.setBackground(Color.PINK);
		th.setForeground(Color.BLUE);
		
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[])
	{
		GUIEX16 g = new GUIEX16();
	}
}
