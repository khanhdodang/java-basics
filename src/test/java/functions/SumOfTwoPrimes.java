package functions;

public class SumOfTwoPrimes {
    public static void main(String[] args) {
        int number = 34;
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {

            // condition for i to be a prime number
            if (checkPrime(i)) {

                // condition for n-i to be a prime number
                if (checkPrime(number - i)) {

                    // n = primeNumber1 + primeNumber2
                    System.out.printf("%d = %d + %d\n", number, i, number - i);
                    flag = true;
                }

            }
        }

        if (!flag)
            System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
    }

    // Function to check prime number
    static boolean checkPrime(int num) {
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}

/*In the above example, we have created the checkPrime() method to find whether a number is prime or not. The method returns true if the passed number is prime.

Here, we have a number 34. The program tries to check if 34 can be represented as the sum of two prime numbers.

Working of Program

First, we run a for loop from i = 2 to number / 2.
Inside the for loop, we used two if statements. The first statement checks if i is prime or not.

If true, the second if statement checks if number - i is prime or not. This is because the sum of i and number - i is equal to number.
If the second statement is also true, then we can say the number 34 is a valid sum of two prime numbers.
 */