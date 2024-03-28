class Sample
{
	public static void main(String args[])
	{
		int i;
		float sum;
		
		sum = 0.0f;
		
		for(i=1;i<=10;i++)
		{
			sum = sum + 1/(float)i;
			System.out.print("i = "+i);
			System.out.println(" sum = "+sum);
		}
	}
}
