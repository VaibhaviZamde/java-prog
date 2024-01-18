import java.util.*;

class Count
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("How many number you want to print : ");
		int n= scan.nextInt();
		
		int even_count=0,odd_count=0;
		
		for(int i = 0;i<n;i++)
		{
			System.out.print("Enter a number :");
			int m = scan.nextInt();
			
			if(m%2==0)
			even_count++;
			else
			odd_count++;
		}
		
		scan.close();
		
		System.out.println("Even  Count is "+even_count);
		System.out.println("Odd  Count is "+odd_count);
	}
}
