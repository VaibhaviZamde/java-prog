class Example {

    public static void main(String[] args) {
        try {
            // Trying to perform a division by zero, which throws an ArithmeticException
            int result = divideByZero();
            System.out.println("Result: " + result);
        } catch (RuntimeException ex) {
            // Wrapping the ArithmeticException with a custom exception
            throw new CustomException("An error occurred during division", ex);
        }
    }

    public static int divideByZero() {
        int dividend = 10;
        int divisor = 0;
        // Attempting to divide by zero, which will throw an ArithmeticException
        return dividend / divisor;
    }

    // Custom exception class extending RuntimeException to allow unchecked exception handling
    static class CustomException extends RuntimeException {
        public CustomException(String message, Throwable cause) {
            // Initializing the cause of this exception using initCause()
            super(message);
            this.initCause(cause);
        }
    }
}

