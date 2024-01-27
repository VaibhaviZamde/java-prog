class Label
{
	public static void main(String args[])
	{
		ABC:
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("i = "+i);
			
			for(int j=5;j>=1;j--)
			{
				System.out.println("j = "+j);
				if(j==5)
				break ABC;								
			}
		}
		System.out.println(" SGGS IT ");
	}
}
