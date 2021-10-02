package day2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int a, b, c;

        System.out.println("Enter the first number:");
        a = enterNumber();
        System.out.println("Enter the second number:");
        b = enterNumber();
        System.out.println("Enter the third number:");
        c = enterNumber();

        findLargestNumber(a, b, c);
        findLargestNumber02(a, b, c);
        findLargestNumber03(a, b, c);
    }

    public static void findLargestNumber(int num1, int num2, int num3) {
        int largest;
        if (num1 >= num2 && num1 >= num3)
            largest = num1;
        else if (num2 >= num1 && num2 >= num3)
            largest = num2;
        else
            largest = num3;

        print(largest);
    }

    public static void findLargestNumber02(int num1, int num2, int num3) {
        int largest;
        if (num1 >= num2) {
            if (num1 >= num3)
                largest = num1;
            else
                largest = num3;
        } else {
            if (num2 >= num3)
                largest = num2;
            else
                largest = num3;
        }
        print(largest);
    }

    public static void findLargestNumber03(int num1, int num2, int num3) {
        int largest, temp;
        //comparing a and b and storing the largest number in a temp variable
        temp = num1 > num2 ? num1 : num2;
        //comparing the temp variable with c and storing the result in the variable
        largest = num3 > temp ? num3 : temp;
        //prints the largest number
        print(largest);
    }

    public static int enterNumber() {
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

    public static void print(int number) {
        System.out.println("The largest number is: " + number);
    }
}
