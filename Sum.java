//WAP to read a number while entered number is greater than 0.
//Print sum of all the entered number
import java.util.*;
class Sum
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int s = 0,n;
		
		do
		{
			System.out.print("Enter any number : ");
			n = scan.nextInt();
			
			s = s + n;
		}
		while(n>0);
		
		scan.close();
		System.out.println("Sum is "+s);
	}
}
