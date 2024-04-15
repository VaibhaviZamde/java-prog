//Abstract Method

abstract class AbstractEx2
{
	abstract public void fun();
	void add(int a , int b)
	{
		int z = a+b ;
		System.out.println("SUM = "+ z);
	}
}

class Sample extends AbstractEx2
{
	public void fun()
	{
		System.out.println("Hii");
	}
	
	public static void main(String args[])
	{
		AbstractEx2 ab = new Sample();
		ab.fun();
		ab.add(10,20);
	}
}


