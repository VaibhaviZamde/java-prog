import java.util.*;

class PositiveEven
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter any integer :");
		int a = scan.nextInt();
		
		if(a >=0)
		{
			if(a%2==0)
			{
				System.out.println("It is positive even intger");
			}
			else
			{
				System.out.println("It is positive intger but not even");
			}
		}
		else
		{
			System.out.println("It is negative integer");
		}
	}
}
