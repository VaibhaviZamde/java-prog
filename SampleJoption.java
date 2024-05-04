import javax.swing.*;
import java.io.*;
class SampleJoption
{
	public static void main(String args[])
	{
		try
		{
			File f = new File("ABC.txt");
			System.out.println(f.getName());
		JOptionPane.showMessageDialog(null,"File Created","Demo",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"File Created","Demo",JOptionPane.WARNING_MESSAGE);
			JOptionPane.showMessageDialog(null,"File Created","Demo",JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null,"File Created","Demo",JOptionPane.NO_OPTION);
		
		JOptionPane.showMessageDialog(null,"File Created","Demo",JOptionPane.QUESTION_MESSAGE);
		
		JOptionPane.showMessageDialog(null,"File Created","Demo",JOptionPane.PLAIN_MESSAGE);
		
		JOptionPane.showMessageDialog(null,"File Created","Demo",JOptionPane.ERROR_MESSAGE);
			//JOptionPane.showInternalMessageDialog(null,"Internal","Hello");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
