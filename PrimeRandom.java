class PrimeRandom
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		
		//int arr[] = {10 , 5, 4, 6,3},
		int count = 0;
		
		int[] randomNumbers = new int[1000000];

		for (int i = 0; i <randomNumbers.length; i++) 
		{
		    long nanoTime = System.nanoTime();
		    randomNumbers[i] = generateRandomNumber(nanoTime);
		}

		//for (int i = 0; i < randomNumbers.length; i++) 
		//{
		  //  System.out.println(randomNumbers[i]);
		//}
		
		for(int num : randomNumbers)
		{
			if(s.isPrime(num))
				count++;		
		}
		System.out.println(count);
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
    	
    	 public static int generateRandomNumber(long nano) 
    	 {
        	int randomNumber = (int) (nano % 10000000);
        	return randomNumber;
    } 
}
