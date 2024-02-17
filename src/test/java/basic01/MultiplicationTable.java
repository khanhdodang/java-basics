import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = input();
        MulTable4(number);
    }

    static void MulTable() {
        for (int i = 1; i <= 10; ++i) {
            for (int j = 1; j <= 10; ++j) {
                System.out.printf("%d * %d = %d \n", j, i, j * i);
            }
        }
    }

    static void MulTable2() {
        for (int i = 1; i <= 10; i++) {
            int j = 1;
            while (j <= 10) {
                System.out.printf("%d * %d = %d \n", j, i, j * i);
                j++;
            }
        }
    }

    static void MulTable3() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 10; j++) {
                System.out.format("%d x %d = %d\t", j, i, i * j);
            }
            System.out.println();
        }
    }

    static void MulTable4(int number) {


        // Use a loop to calculate and print the multiplication table for the input number
        for (int i = 1; i <= 10; i++) {
            // Calculate and print the result of num1 multiplied by (i+1)
//            System.out.println(number + " x " + i + " = " + (number * i));
            System.out.printf("%d * %d = %d \n", number, i, number * i);
        }
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
