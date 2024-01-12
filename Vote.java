import java.util.Scanner;
class Vote
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your Age");
		int age = scan.nextInt();
		scan.close();
		
		if(age >= 19)
			System.out.println("You are eligibal for voting");
		else
			System.out.println("You are not eligibal for voting");
			
	}
}
