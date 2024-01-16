import java.util.*;
class Factorial 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter any integer :");
		int n = scan.nextInt();
		
		scan.close();
		
		int i=1,f=1;
		
		while(i <=n)
		{
			f= f*i;
			i++;
		}
		
		System.out.println("Factorial is "+f);
	}
}
