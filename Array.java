import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of inputs (n)
        System.out.print("Enter the number of inputs (n): ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Initialize an array to store the inputs
        String[] inputs = new String[n];

        // Get inputs from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter input " + (i + 1) + ": ");
            inputs[i] = scanner.nextLine();
        }

        // Sort the array based on the 2nd and 3rd characters of each input
        customSortArray(inputs);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (String input : inputs) {
            System.out.println(input);
        }

        // Close the scanner
        scanner.close();
    }

    public static void customSortArray(String[] array) {
        // Custom sorting algorithm based on the 2nd and 3rd characters
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (compareStrings(array[j], array[j + 1]) > 0) {
                    // Swap if the 2nd and 3rd characters are out of order
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static int compareStrings(String s1, String s2) {
        // Compare the 2nd characters first
        int result = s1.charAt(1) - s2.charAt(1);

        // If the 2nd characters are the same, compare the 3rd characters
        if (result == 0) {
            result = s1.charAt(2) - s2.charAt(2);
        }

        return result;
    }
}

