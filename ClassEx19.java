class ClassEx19
{
	public static void main(String args[])
	{
		try
		{
			System.out.println(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Array is out of bound ...");
		}
		finally
		{
			System.out.println("Finally Block Always gets executed...");
		}
	}
}
