//Create 4 function as name first , last , secondLast , Sum 
//which will return the array value as function name

class Function
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3};
		int size = arr.length;
		
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		
		int w = first(arr);
		System.out.println(w);
		
		int x = last(arr);
		System.out.println(x);
		
		int y = lastSecond(arr);
		System.out.println(y);
		
		int z = sum(arr,size);
		System.out.println(z);
	}
	
	private static int first(int a[])
	{
		return a[0];
	}
	
	private static int last(int a[])
	{
		return a[3-1];
	}
	
	private static int lastSecond(int a[])
	{
		return a[3-2];
	}
	
	private static int sum(int a[],int s)
	{
		int sum=0;
		
		for(int i=0;i<s;i++)
		{
			sum = sum + a[i];
		}
		
		return sum;
	}
}
