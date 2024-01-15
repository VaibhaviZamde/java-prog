import java.util.*;
class Ternaryeven
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter any integer : ");
		int a = scan.nextInt();
		scan.close();
		
		String z = (a%2==0)?"Even":"Odd";
		System.out.println(z);
	}
}
