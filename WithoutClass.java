class SGGS
{
	static int x = 786;
	int y=14;

	public static void main(String args[])
	{
		SGGS s1 = new SGGS();
		System.out.println(s1);
		
		SGGS s2 = new SGGS();
		System.out.println(s2);
	}
	
	SGGS()
	{
		System.out.println("SGGS's Constructor ");
	}
	
	public String myToString()
	{
		return "Hii"+getClass().getName()+"@"+Integer.toHexString(hashcode());
	}

}
