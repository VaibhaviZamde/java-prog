//WAP to read a real number from the keyboard and print 
/*
	Smallest integer not less than the num(large)
	The given number 
	Largest integer not greater than the number(small)

*/
import java.util.Scanner;
class RealNum
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any real number : ");
		double real = scan.nextDouble();
		
		System.out.println("Smallest integer not less than the number = "+Math.ceil(real));
		System.out.println("The given number = "+real);
		System.out.println("Largest integer not greater than the number = "+Math.floor(real));
	}
}
