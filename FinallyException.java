class Finally 
{
	public static void main(String args[])
	{
		try
		{
			int a=10,b=0;
			int res ;
			res = a/b;
			System.out.println("Quotient is "+res);
		}
		
		catch(ArithmeticException ex)
		{
			System.out.println("Divide by zero");
		}
		
		finally
		{
			System.out.println("Finally Block always executed..");
		}
	}
}
