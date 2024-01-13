import java.util.*;

class Greatest
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ENter 1st Integer : ");
		int a = scan.nextInt();
		
		System.out.print("Enter 2nd integer : ");
		int b= scan.nextInt();
		
		System.out.print("Enter 3rd integer : ");
		int c = scan.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is greatest.");
			}
			else
			{
				System.out.println(c+" is greatest.");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+"is greatest");
			}
			else
			{
				System.out.println(c+" is greatest");
			}
		}
	}	
}	
