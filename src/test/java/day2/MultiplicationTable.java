package day2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = enterNumber();
        multiTable(n);
    }

    public static void multiTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }

    public static int enterNumber() {
        int n = 0;
        Scanner s = null;
        System.out.print("Enter Number:");
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
