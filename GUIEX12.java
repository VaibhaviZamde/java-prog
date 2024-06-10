import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.filechooser.*;

class GUIEX12 extends JFrame implements ActionListener
{
	private JTextArea ta;
	JFileChooser fc;
	private JScrollPane sp;
	private JMenuBar mb;

	public GUIEX12()
	{
		setTitle("File & Menubar");
		
		mb = new JMenuBar();
		setJMenuBar(mb);
		
		JMenu m1 = new JMenu("FIle");
		mb.add(m1);
		
		String x[] = {"New","Save","Open","Exit"};
		for(int i=0;i<x.length;i++)
		{
			if(i==3)
			m1.addSeparator();
			JMenuItem mi = new JMenuItem(x[i]);
			m1.add(mi);
			mi.addActionListener(this);
		}
		
		JMenu m2 = new JMenu("Edit");
		mb.add(m2);
		
		String y[] = {"Cut","Copy","Paste"};
		for(int i=0;i<y.length;i++)
		{
			JMenuItem mi = new JMenuItem(y[i]);
			m2.add(mi);
			mi.addActionListener(this);
		}
		
		ta = new JTextArea();
		sp = new JScrollPane(ta);
		add(sp);
		ta.setFont(new Font("TimesNewRoman",Font.BOLD,22));
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			String cmd = e.getActionCommand();
			fc = new JFileChooser("/home/vaibhavi");
			
			String file_types[] = {"Java files" , "C files" , "Text files" , "Cpp files" , "Odt files"};
			String file_extensions[] = {"java" , "c" ,"txt", "cpp" ,"odt"};
			
			FileNameExtensionFilter filter;
			
			for(int i=0; i<file_types.length;i++)
			{
				filter = new FileNameExtensionFilter(file_types[i],file_extensions[i]);
				fc.setFilter(filter);
			}
			
			switch(cmd)
			{
				case "New" : ta.setText(" "); break;
				
				case "Open":
					
					int result = fc.showOpenDialog(this);
					if(result == JFileChooser.APPROVE_OPTION)
					{
						File f = new fc.getSelectedFile();
						FileInputStream fin = new FileInputStream(f);
						
						int FileSize = fin.available();
						byte file_date[] = new byte[file_size];
						fin.read(file_data);
						fin.close();
						String data = new String(file_data);
						ta.setText(data);
					}
					break;
				
				case "Save":
					int result = fc.showSaveDialog(this);
					if(result == JFileChooser.APPROVE_OPTION)
					{
						String data = ta.getText();
						byte file_data[] = data.getBytes();
						File f = fc.getSelectedFile();
						
						FileOutputStream fout = new FileOutputStream(f);
						fout.write(file_data);
						fout.close();
						
						JOptionPane.showMessageDialog(null,"File Save");
					}
					break;
					
				case "Exit": this.dispose(); break;
				case "Cut" : ta.cut(); break;
				case "Copt": ta.copy(); break;
				case "Paste" : ta.paste(); break; 
			}
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex);
		}
	}
	
	public static void main(String args[])
	{
		GUIEX12 g = new GUIEX12();
	}
}


