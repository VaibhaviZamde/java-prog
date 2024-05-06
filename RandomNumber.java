public class RandomNumber 
{
    public static void main(String[] args) 
    {
        int[] randomNumbers = new int[1000000];

        // Generate and store 10 random numbers in the array
        for (int i = 0; i <randomNumbers.length; i++) 
        {
            long nanoTime = System.nanoTime();
            randomNumbers[i] = generateRandomNumber(nanoTime);
        }

        // Print the generated random numbers
        System.out.println("Generated Random Numbers:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);
        }
    }

    public static int generateRandomNumber(long nano) {
        int randomNumber = (int) (nano % 10000000);
        return randomNumber;
    }
}




/*class RandomNumber {
    public static void main(String[] args) {
        // Generate and print 10 random numbers
        for (int i = 0; i < 10; i++) 
        {
            long nanoTime = System.nanoTime();
            int randomNumber = generateRandomNumber(nanoTime);
            System.out.println("Random Number " + (i + 1) + ": " + randomNumber);
        }
    }

    public static int generateRandomNumber(long nano) {
        int randomNumber = (int) (nano % 10000000);

        return randomNumber;
    }
}
*/
