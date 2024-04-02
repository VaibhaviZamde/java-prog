class ClassEx17
{
	public static void main(String args[])
	{
		ClassEx17 ce = new ClassEx17();
		try
		{	
			//ce.wait(10000000);
			System.out.println(args[0]);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			System.out.println(ex.getMessage());
			System.out.println(ex.getLocalizedMessage());
			System.out.println(ex.toString());
			//ex.wait(1000000);
			System.out.println(ex.equals(ex));
			System.err.println(ex.getClass());
			//ex.notify();
			//ex.addSuppressed(ex);
			System.err.println(ex.getCause());
			System.err.println(ex.fillInStackTrace());
			System.err.println(ex.getStackTrace());
			System.err.println(ex.hashCode());
			//System.err.println(ex.initCause(ex));
			//ex.notifyAll();]
			System.err.println(ex.getSuppressed());
		}
	}
}
