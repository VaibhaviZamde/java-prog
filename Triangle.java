import java.util.*;

class Triangle
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 1st angle :");
		int a = scan.nextInt();
		
		System.out.print("Enter 2nd angle :");
		int b = scan.nextInt();
		
		System.out.print("Enter 3rd angle :");
		int c = scan.nextInt();
		
		if(a+b+c == 180)
		{
			System.out.println("It is a triangle");
		}
		else
		{
			System.out.println("It is not triangle");
		}
	}
}
