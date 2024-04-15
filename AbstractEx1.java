//Abstract Method

abstract class AbstractEx1
{
	abstract public void fun();
}

class Sample extends AbstractEx1
{
	public void fun()
	{
		System.out.println("Hii");
	}
	
	public static void main(String args[])
	{
		AbstractEx1 ab = new Sample();
		ab.fun();
	}
}


