class ClassEx23
{
	public static void main(String args[]) throws InterruptedException
	{
		try
		{
			Thread.sleep(5000);
			System.out.println("try 1");
			Thread.sleep(3000);
			System.out.println(args[0]);
			Thread.sleep(5000);
			System.out.println("try 2");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
		}
		finally
		{
			System.out.println("Inside Finally");
		}			
	}
}
