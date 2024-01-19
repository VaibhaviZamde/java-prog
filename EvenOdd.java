import java.util.*;

class EvenOdd
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number :");
		int n = scan.nextInt();
		
		scan.close();
		
		int i ;
		if(n%2 == 0)
		i=2;
		else
		i=1;
		
		for(;i<=n;i+=2 )
		System.out.println(i+" ");
	}
}
