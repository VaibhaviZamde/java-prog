import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUIEX9 extends JFrame implements ActionListener
{
	private JLabel lb_num1 , lb_num2, lb_res;
	private JTextField txt_num1,txt_num2,txt_res;
	private JButton add_btn,sub_btn,mul_btn,div_btn;
	
	public GUIEX9()
	{
		setTitle("Calculator");
		
		lb_num1 = new JLabel("Enter 1st integer ");
		lb_num2 = new JLabel("Enter 2nd integer ");
		lb_res = new JLabel("Result ");
		
		txt_num1 = new JTextField(10);
		txt_num2 = new JTextField(10);
		txt_res = new JTextField(10);
		txt_res.setEditable(false);
		
		add_btn = new JButton("ADD");
		sub_btn = new JButton("SUB");
		mul_btn = new JButton("MUL");
		div_btn = new JButton("DIV");
		
		setLayout(new GridLayout(5,2));
		
		add(lb_num1);
		add(txt_num1);
		add(lb_num2);
		add(txt_num2);
		add(add_btn);
		add(sub_btn);
		add(mul_btn);
		add(div_btn);
		add(lb_res);
		add(txt_res);
		
		add_btn.addActionListener(this);
		sub_btn.addActionListener(this);
		mul_btn.addActionListener(this);
		div_btn.addActionListener(this);
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		try
		{
			int n1 = Integer.parseInt(txt_num1.getText());
			int n2 = Integer.parseInt(txt_num2.getText());
			int result = 0;
			
			String cap = e.getActionCommand();
			
			switch(cap)
			{
				case "ADD":
					result = n1+n2;
					break;
				
				case "SUB":
					result = n1-n2;
					break;
					
				case "MUL":
					result = n1*n2;
					break;
				
				case "DIV":
					result = n1/n2;
					break;	
			}
			
			txt_res.setText(result+" ");
		}
		catch(Exception ex)
		{
			System.out.println("dcc");
		}
	}

	public static void main(String args[])
	{
		GUIEX9 g = new GUIEX9();
	}
}
