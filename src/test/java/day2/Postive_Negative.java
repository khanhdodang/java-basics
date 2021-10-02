package day2;

import java.util.Scanner;

public class Postive_Negative {
    public static void main(String[] args) {
        validate(enterNumber());
        validate(2147483647);
        validate(-33);
        validate(0);

    }

    public static int enterNumber() {
        int n = 0;
        Scanner s = null;
        System.out.print("Enter the number you want to check:");
        try {
            s = new Scanner(System.in);
            n = s.nextInt();
        } catch (Exception ex) {
            System.err.println(ex.toString());
            return 0;
        }
        return n;
    }

    public static void validate(int number) {
        String message;
        if (number > 0) {
            message = "The given number " + number + " is Positive";
        } else if (number < 0) {
            message = "The given number " + number + " is Negative";
        } else {
            message = "The given number " + number + " is neither Positive nor Negative ";
        }
        System.out.println(message);
    }

    public void origin() {
        int n = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        n = s.nextInt();
        if (n > 0) {
            System.out.println("The given number " + n + " is Positive");
        } else if (n < 0) {
            System.out.println("The given number " + n + " is Negative");
        } else {
            System.out.println("The given number " + n + " is neither Positive nor Negative ");
        }
    }
}
