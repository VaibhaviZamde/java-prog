class Sample
{
	int x;
	Sample(int x)
	{
		this.x=x;
	}
	
	public static void main(String args[])
	{
		try
		{
			Sample s = new Sample(2);
			System.exit(0);
			//Sample s = new Sample(2);
			/*ClassEx30.java:15: error: variable s is already defined in method main(String[])
			Sample s = new Sample(2);
			       ^
			       1 error
			*/
			
			s = new Sample(23);
		}
		catch(Exception ex)
		{
			System.out.println("Exception occured");
		}
		finally
		{
			System.out.println("Garbage!!!");
		}
	}
}
