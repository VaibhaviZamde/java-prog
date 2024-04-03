class ClassEx18
{
	public static void main(String args[])
	{
		try 
		{
			System.out.println(args[0]);
		}
		finally
		{
			System.out.println("Inside Finally");
		}
		catch(ArrayIndexOfBoundsException ex)
		{
			System.out.println(ex);
		}
	}
}
