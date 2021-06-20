package array;

// Check if Int Array contains a given value

public class CheckIntArray {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5};
        int toFind = 3;
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }
}
/*
Output

3 is found.
In the above program, we have an array of integers stored in variable num. Likewise, the number to be found is stored in toFind.

Now, we use a for-each loop to iterate through all elements of num and check individually if toFind is equal to n or not.

If yes, we set found to true and break from the loop. If not, we move to the next iteration.
 */
