import java.util.*;

class Swap 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1st Integer : ");
		int x = scan.nextInt();
		
		System.out.println("Enter 2nd Integer : ");
		int y = scan.nextInt();
		
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("After Swapping values");
		System.out.println("1st Integer : "+x);
		System.out.println("2nd Integer : "+y);
	}
}
