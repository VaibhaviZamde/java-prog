import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import javax.swing.tree.*;

class GUIEX17 extends JFrame implements TreeSelectionListener 
{
	private JLabel lb;
	private JTree tr;
	private DefaultMutableTreeNode tnIND , tnMH , tnRJ,tnChild;

	public GUIEX17()
	{
		setTitle("TREE ");
		
		lb = new JLabel("[]");
		add(lb,BorderLayout.NORTH);

		tnIND = new DefaultMutableTreeNode("INDIA");
		
		tnMH = new DefaultMutableTreeNode("MAHARASHTRA");
		tnIND.add(tnMH);
		
		tnRJ = new DefaultMutableTreeNode("RAJASTAN");
		tnIND.add(tnRJ);
		
		String x[] = {"AMARAVATI","WARDHA","NAGPUR"};
		for(int i=0;i<x.length;i++)
		{
			tnChild = new DefaultMutableTreeNode(x[i]);
			tnMH.add(tnChild);
		}
		
		String y[] = {"UDAIPUR","JAIPUR","RATAU"};
		for(int i=0;i<x.length;i++)
		{
			tnChild = new DefaultMutableTreeNode(y[i]);
			tnRJ.add(tnChild);
		}
		
		tr = new JTree(tnIND);
		add(tr,BorderLayout.CENTER);
		tr.addTreeSelectionListener(this);
		
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void valueChanged(TreeSelectionEvent e)
	{
		TreePath p = tr.getSelectionPath();
		lb.setText(p+"");
	}

	public static void main(String args[])
	{
		GUIEX17 g = new GUIEX17();
	}
}
