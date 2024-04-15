//Abstract Method

abstract class AbstractEx1
{
	abstract public void fun();
	void add(int a , int b)
	{
		int z = a+b ;
		System.out.println("SUM = "+ z);
	}
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
		Sample sm = new Sample();
		sm.fun();
		sm.add(10 , 3);
	}
}


