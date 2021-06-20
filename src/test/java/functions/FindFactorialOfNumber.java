package functions;

/*
The factorial of a positive number n is given by:

factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n
 */
public class FindFactorialOfNumber {
    public static void main(String[] args) {
        int num = 6;
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
        // 6 * 5 * 4 * 3 * 2 * 1 * 1 (for 0) = 720
    }

    public static long multiplyNumbers(int num) {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}
