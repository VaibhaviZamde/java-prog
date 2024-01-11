import java.util.*;
class Check
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ENter any integer");
		int x = scan.nextInt();
		
		if(x%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}
