import java.util.*;

class Fibonacci
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter how many number you want to print :");
		int n = scan.nextInt();
		
		scan.close();
		
		int i=1,j=1;
		
		if(n>=1)
		System.out.println(i+" ");
		
		if(n>=2)
		System.out.println(j+" ");
		
		int k = 3;
		while(k<=n)
		{
			int z = i+j;
			System.out.println(z+" ");
			i=j;
			j=z;
			k++;	
		}
	}
}
