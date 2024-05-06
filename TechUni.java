class College
{
	String collName;
	College(String collName)
	{
		this.collName = collName;
		System.out.println(collName);
	}
}

class TechUni extends College
{
	String uniName;
	
	TechUni(String uniName)
	{
		super(uniName);
		this.uniName = uniName;
		System.out.println(uniName);
	} 
	
	public static void main(String args[])
	{
		System.out.println("Inside main");
		TechUni t = new TechUni("SGGS");
		
	}
	
}
