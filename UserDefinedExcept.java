import java.util.*;

class User
{
	public static void main(String args[])
	{
		try
		{
			Scanner scan = new Scanner(System.in);
	
			String s = new String("Vaibhavi");
			System.out.println("Enter any string :");
			String str  = scan.nextLine();
			
			if(s.equals(str))
			{
				System.out.println("Both string same..");
			}
			else
			{
				throw new StringNotFoundException("String are not same");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}

class StringNotFoundException extends Exception
{
	public StringNotFoundException(String msg)
	{
		super(msg);
	}
}
