class Father
{
	int balance = 123;
	public Father()
	{
		//this(10);
		//System.out.println("this operator");
		System.out.println("Inside default");	
	}
	
	public Father(int balance)
	{
		balance = balance;
		System.out.println("Inside Parameterized");
		System.out.println(balance);
	}
	
	public static void main(String args[])
	{
		Father son = new Father();
		Father daughter = new Father(4);
		
	}
}
