import java.util.*;

class SecondHighest
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter number of array elements : ");
		int n = s.nextInt();
		int arr[] = new int[n]; 
		
		System.out.print("Enter array elements : ");
		for(int i=0; i<n; i++)
		{
			arr[i] = s.nextInt();
		}
		
		System.out.print("Array Elements : ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		int ele = secondHigh(arr);
		System.out.println("\nSecond highest element is "+ele); 
	}
	
	public static int secondHigh(int array[])
	{
		int high = Integer.MIN_VALUE;
		int secHigh = Integer.MIN_VALUE;
		
		for(int i : array)
		{
			if(i > high)
			{
				secHigh = high;
				high = i;
			}
			else if( i > secHigh)
			{
				secHigh = i;
			}
		}
		return secHigh;
	}
}






