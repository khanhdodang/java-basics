package day2;

public class Palindrome {
    public static void main(String args[]) {
        for (int i = 0; i < 100; i++) {
            if (check(i)) {
                System.out.println(i + " is Palindrome");
            }
        }
    }

    public static boolean check(int number) {
        if (number < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(number);
        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
