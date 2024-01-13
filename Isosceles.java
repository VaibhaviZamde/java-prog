import java.util.*;

class Isoceles 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 1st Integer : ");
		int a = scan.nextInt();
		
		System.out.print("Enter 2nd Integer : ");
		int b = scan.nextInt();
		
		System.out.print("Enter 3rd Integer : ");
		int c = scan.nextInt();
		
		if(a+b+c == 180 && a==b || b==c|| c==a)
		{
			System.out.println("It is isoceles triangle");
		}
		else
		{
			System.out.println("It is not an isosceles triangle");
		}
	}
}
