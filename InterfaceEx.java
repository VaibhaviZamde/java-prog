interface inAdd
{
	void add();
}

interface inSub
{
	void sub();
}

class Arithmetic implements inAdd , inSub
{
	private int  P , Q;
	
	public Arithmetic(int p, int q)
	{
		P = p;
		Q = q;
	}
	
	@Override 
	public void add()
	{
		int z = P + Q;
		System.out.println("Addition is "+z);
	}
	
	@Override 
	public void sub()
	{
		int z = P - Q;
		System.out.println("Subtraction is "+z);
	}
}

class InterfaceEx
{
	public static void main(String args[])
	{
		Arithmetic a = new Arithmetic(10,20);
		a.add();
		a.sub();
	}
}




