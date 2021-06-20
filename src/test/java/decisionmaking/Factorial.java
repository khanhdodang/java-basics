package decisionmaking;

// Find Factorial of a number using for loop

public class Factorial {
    public static void main(String[] args) {
        /*
        The factorial of a positive number n is given by:

        factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n
         */
        int num = 10;
        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
