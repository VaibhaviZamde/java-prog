import java.util.*;
class Ternary
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ENter 1st integer :");
		int a = scan.nextInt();
		
		System.out.println("Enter 2nd integer :");
		int b = scan.nextInt();
		
		scan.close();
		
		int c = a>b?a:b;
		System.out.println("Greatest is "+c);
	}
}
