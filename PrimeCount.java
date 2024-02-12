class PrimeCount 
{
	public static void main(String args[]) 
	{
		PrimeCount pc = new PrimeCount();

		int arr[] = {10, 2, 5, 6, 7, 9};
		int size = arr.length;

		int count = pc.validCount(arr, size);
		System.out.println(count);
    	}

        public int validCount(int arr[], int len) 
        {
		int valcount = 0;

		for (int i = 0; i < len; i++) 
		{
			if (isPrime(arr[i])) 
			{
		        	valcount++;
		    	}
		}
		return valcount;
    	}

    	public boolean isPrime(int num) 
    	{
        	if (num < 2) 
        	{
        	    return false;
        	}

        	for (int i = 2; i * i <= num; i++) 
        	{
            		if (num % i == 0) 
            		{
                		return false;
            		}
        	}
        	return true;
    	}
}

