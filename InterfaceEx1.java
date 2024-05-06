interface A
{
	String name = "Vaibhavi ";
	void funA();
}

interface B
{
	int age = 20 ;
	void funB();
}

class Sample implements A,B
{
	public static void main(String args[])
	{
		Sample sm = new Sample();
		sm.funA();
		sm.funB();
	}	
	
	public void funA()
	{
		//name = "abc";
		/*
		InterfaceEx1.java:24: error: cannot assign a value to static final variable name
		name = "abc";
		^
	1 error
		*/
		System.out.println(name);
	}
	
	public void funB()
	{
		System.out.println(age);
	}
}
