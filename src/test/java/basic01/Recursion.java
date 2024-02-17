import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        int number = input();
        int result = sum2(number);
        System.out.println("Sum Recursion: " + result);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    public static int sum2(int k) {
        return (k > 0) ? k + sum2(k - 1) : 0;
    }

    public static int sum2(int start, int end) {
        return (end > start) ? end + sum2(start, end - 1) : end;
    }

    static int input() {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.print("Input a number: ");

        // Read and store the input number
        return in.nextInt();
    }
}
