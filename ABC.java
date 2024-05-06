class College
{
	static
	{
		System.out.println("college static");
	}
	
	College()
	{
		System.out.println("college constrctor");
	}
}

class ABC extends College
{	
	static College s = new College();	
	
	public static void main(String args[])
	{
		ABC a = new ABC();
		System.out.println("Inside Main");
	}
	
	static 
	{
		System.out.println("ABC static");
	}
	
	ABC()
	{
		System.out.println("ABC constaructor");
	}
}



