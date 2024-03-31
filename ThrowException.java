/*
ThrowException.java:11: error: constructor Sample in class Sample cannot be applied to given types;
			throw new Sample("Invalid String");
			      ^
  required: no arguments
  found:    String
  reason: actual and formal argument lists differ in length
1 error

*/

class Sample
{
	public static void main(String args[])
	{
		if(args[0] == "Hello")
		{
			System.out.println("String is right");
		}
		else
		{
			throw new Exception("Invalid String");
		}
	}
}


