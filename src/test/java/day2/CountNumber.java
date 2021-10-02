package day2;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        int num = enterNumber();
        int result = countNumber(num);
        print(result);
    }

    public static int countNumber(int number) {
        if (number == 0) return 1;

        int count = 0;

        while (number != 0) {
            number = number / 10;
            // num /= 10;
            ++count;
        }
        return count;
    }

    public static void print(int number) {
        System.out.println("Number of digits: " + number);
    }

    public static int enterNumber() {
        System.out.print("Enter Number: ");
        int n = 0;
        Scanner s = null;
        try {
            s = new Scanner(System.in);
            n = s.nextInt();
        } catch (Exception ex) {
            System.err.println(ex.toString());
            n = 0;
        }
        return n;
    }
}
