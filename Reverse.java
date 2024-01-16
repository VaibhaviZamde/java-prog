import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any integer: ");
		int n = scan.nextInt();
		scan.close();
		
		int rev = 0;
		
		while(n>0)
		{
			int y = n%10;//It will find the last digit
			rev = (rev *10)+ y;
			n = n/10;
		}
		
		System.out.println("Reverse number is :"+rev);
	}
}
