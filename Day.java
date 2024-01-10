import java.util.*;
class Day
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1 - 7 any one number");
		int op = scan.nextInt();
		
		switch(op)
		{
			case 1:
				System.out.println("It's Monday");
				break;
			
			case 2:
				System.out.println("It's Tuesday");
				break;
				
			case 3:
				System.out.println("It's Wednesday");
				break;
				
			case 4:
				System.out.println("It's Thrusday");
				break;
				
			case 5:
				System.out.println("It's Friday");
				break;
				
			case 6:
				System.out.println("It's Saturday");
				break;
				
			case 7:
				System.out.println("It's Sunday");
				break;
				
			default :
				System.out.println("Enter valid option");
		}	
	}
}
