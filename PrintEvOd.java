import java.util.*;

class PrintEvOd
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int i=0 , n;
		
		do 
		{
			System.out.println("Enter any number :");
			n = scan.nextInt();
			
			if(n%2 == 0)
				i=2;
			else
				i=1;
				
			for(;i<n;i+=2)
			{
				System.out.print(i +"\t");
			}
			System.out.println();
		}
		while(n>0);
	}
}
