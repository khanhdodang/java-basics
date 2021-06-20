package array;

// Check if an array contains the given value using Stream

import java.util.stream.IntStream;

public class CheckIntArray02 {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5};
        int toFind = 7;

        boolean found = IntStream.of(num).anyMatch(n -> n == toFind);

        if (found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");

    }
}

/*
Output

7 is not found.
In the above program, instead of using a for-each loop, we convert the array to an IntStream and use its anyMatch() method.

anyMatch() method takes a predicate, an expression, or a function that returns a boolean value. In our case, the predicate compares each element n in the stream to toFind and returns true or false.

If any of the element n returns true, found is set to true as well.
 */