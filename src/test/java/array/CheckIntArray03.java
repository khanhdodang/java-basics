package array;

// Check if an array contains a given value for non-primitive types

import java.util.Arrays;

public class CheckIntArray03 {
    public static void main(String[] args) {

        String[] strings = {"One", "Two", "Three", "Four", "Five"};
        String toFind = "Four";

        boolean found = Arrays.stream(strings).anyMatch(t -> t.equals(toFind));

        if (found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }
}

/*
Output

Four is found.
In the above program, we've used a non-primitive data type String and used Arrays's stream() method to first convert it to a stream and anyMatch() to check if the array contains the given value toFind.
 */
