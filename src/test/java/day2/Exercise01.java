package day2;

public class Exercise01 {
    /*
    Write a Java program to get a number from the user and print whether it is positive or negative
    Write a Java program to find greatest of 3 numbers.
    Write a Java to display the multiplication table of a given integer using for loop.
    Write a Java program count the number of digits of the number using while loop.
    Write a Java program to reverse a number using while loop.
    Write a Java program to check Number is Palindrome or not using while loop.
     */

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            Check_Palindrome_number(i);
        }
    }

    public static void Check_Palindrome_number(int num) {
        boolean isPrime = true;
        if (num > 2) {
            int i = 1;

            while (i <= num / 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        if (isPrime)
            System.out.println(num + " Là số nguyên tố!");
//        else
//            System.out.println(num + " Không phải là số nguyên tố!");
    }

}
