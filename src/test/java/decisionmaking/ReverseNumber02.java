package decisionmaking;

// Reverse a number using a for loop in Java

public class ReverseNumber02 {
    public static void main(String[] args) {

        int num = 1234567, reversed = 0;

        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
