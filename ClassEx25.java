import java.util.*;

class Sample
{
	public static void main(String args[])
	{
		Sample sam = new Sample();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		int n = s.nextInt();
		
		boolean rev = sam.rever(n);
		
		if(rev)
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
	}
	
	public boolean rever(int n)
	{
		int revNum = 0;
		int originNum = n;
	
		while (n != 0) 
		{
		    int remainder = n % 10;
		    revNum = revNum * 10 + remainder;
		    n /= 10;
		}
		
		return revNum == originNum ;
	}
}
