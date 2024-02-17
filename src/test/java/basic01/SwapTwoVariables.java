import java.util.Scanner;

public class SwapTwoVariables {
    public static void main(String[] args) {
        int a = input();
        int b = input();
        swap5(a, b);
    }

    public static void swap(int a, int b) {
        System.out.printf("a=%d ; b=%d\n", a, b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("a=%d ; b=%d\n", a, b);
    }

    public static void swap2(int a, int b) {
        System.out.printf("a=%d ; b=%d\n", a, b);
        a = a * b;
        b = a / b;
        a = a / b;

        System.out.printf("a=%d ; b=%d\n", a, b);
    }

    public static void swap3(int a, int b) {
        System.out.printf("a=%d ; b=%d\n", a, b);
        int temp = a;
        a = b;
        b = temp;

        System.out.printf("a=%d ; b=%d\n", a, b);
    }

    public static void swap4(int a, int b) {
        System.out.printf("a=%d ; b=%d\n", a, b);
        b = a + b - (a = b);

        System.out.printf("a=%d ; b=%d\n", a, b);
    }

    /**
     * swap the numbers using XOR operator
     * @param a
     * @param b
     */
    public static void swap5(int a, int b) {
        System.out.printf("a=%d ; b=%d\n", a, b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.printf("a=%d ; b=%d\n", a, b);
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
