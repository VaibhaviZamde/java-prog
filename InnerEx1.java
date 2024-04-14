//Member inner class

class Outer
{
	class Inner
	{
		Inner()
		{
			System.out.println("Hii");
		}
	}
	
	public static void main(String args[])
	{
		Outer o = new Outer();
		//Inner;
		Inner i = o.new Inner();
	} 
}
