//Nested try block

class Array
{
	public static void main(String args[])
	{
		try
		{
			int a = 4, b=2 , c =3;
			int p[] = {10,20};
			p[3] = 33;
			
			try
			{
				int result = a / (b-c);
				System.out.println("Division is "+result);
			}
			catch(ArithmeticException ex)
			{
				System.out.println("Divide by zero error");
			}
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Array index out of bound");
		}
	}
}
