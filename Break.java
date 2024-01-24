//WAP for 5number  and go out of loop when the entered value is  equal to 2

class Break
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i+"\t");
			
			if(i==2)
			break;
		}
		
		System.out.println("Out of For loop");
	}
}
