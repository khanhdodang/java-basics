package org.study;

import java.util.Scanner;

public class EvenOdd3 {
    public static void main(String[] args) {
        int num = input();
        checkEvenOdd3(num);
    }

    static void checkEvenOdd(int number) {
        if (number % 2 == 0)
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");
    }

    static void checkEvenOdd2(int number) {
        String evenOdd = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + evenOdd);
    }

//    https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/
    static void checkEvenOdd3(int number) {
        // if n|1 if greater than n then this number is even
        String evenOdd = ((number | 1) > number) ? "even" : "odd";
        System.out.println(number + " is " + evenOdd);
    }

    static void checkEvenOdd4(int number) {
        // Bitwise AND of any odd number by 1 gives 1
        String evenOdd = ((number & 1) == 1) ? "even" : "odd";
        System.out.println(number + " is " + evenOdd);
    }

    static void checkEvenOdd5(int number) {
        // if number^1 increments by 1 then its even number,
        // else odd
        String evenOdd = ((number ^ 1) == number + 1) ? "even" : "odd";
        System.out.println(number + " is " + evenOdd);
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
