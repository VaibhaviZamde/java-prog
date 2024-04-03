class ClassEx22
{
	public static void main(String args[])
	{
		try
		{
			Thread.sleep(10000);
			System.out.println("try 1");
			Thread.sleep(10000);
			System.out.println(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
		}
		catch(InterruptedException ex)
		{
			System.out.println(ex);
		}
		catch(Exception ex)
		{
			System.out.println("Uncaught Exception..");
		}	
		finally
		{
			System.out.println("Inside Finally");
		}			
	}
}
