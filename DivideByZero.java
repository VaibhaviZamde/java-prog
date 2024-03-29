class Exception 
{
	public static void main(String args[])
	{
		int a = 10,b=5,c=5;
		
		try
		{
			int z = a / (b-c);
			System.out.println("Division is "+z);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Divide by zero exception");
		}
		
		int z = a / (b+c);
		System.out.println("Division is "+z);
	}
}
