import java.util.*;

class Prime
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number");
		int n = scan.nextInt();
		scan.close();
		
		int c = 0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i == 0)
			c++;
		}
		
		if(c == 2)
		System.out.println("It is prime number");
		else
		System.out.println("It is not prime number");
	}
}
