import javax.swing.*;

class GUIEX24 
{
	public static void main(String args[])
	{
		int res = JOptionPane.showConfirmDialog(null,"Are you sure ?");
		
		System.out.println("Result = "+res);
		
		if(res == JOptionPane.YES_OPTION)
		{
			System.out.println("Yes button is pressed..");
		}
		else 
		{
			if(res == JOptionPane.NO_OPTION)
			{
				System.out.println("No button is pressed");
			}
			else
			{
				if(res == JOptionPane.CANCEL_OPTION)
				{
					System.out.println("Cancel button is pressed");
				}
			}
		}
	}
}
