class Multiple
{
	public static void main(String args[])
	{
		int b= 5;
		int a[] = {10 , 5};
		try
		{
			int res = a[2] / (a[1] - b);
			System.out.println("Result");	
		}
		
		catch(ArithmeticException ex)
		{
			System.out.println("Divide by zero error");
		}
		
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Array index is out of bound");
		}
		
		catch(ArrayStoreException ex)
		{
			System.out.println("Array Store Error");
		}
		
		int res = a[0] / b;
		System.out.println(res + " Quotient");
	}
}

