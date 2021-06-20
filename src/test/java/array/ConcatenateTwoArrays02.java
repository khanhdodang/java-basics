package array;

import java.util.Arrays;

public class ConcatenateTwoArrays02 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int length = array1.length + array2.length;

        int[] result = new int[length];
        int pos = 0;
        for (int element : array1) {
            result[pos] = element;
            pos++;
        }

        for (int element : array2) {
            result[pos] = element;
            pos++;
        }

        System.out.println(Arrays.toString(result));
    }
}

/*
In the above program, instead of using arraycopy, we manually copy each element of both arrays array1 and array2 to result.

We store the total length required for result, i.e. array1.length + array2. length. Then, we create a new array result of the length.

Now, we use the for-each loop to iterate through each element of array1 and store it in the result. After assigning it, we increase the position pos by 1, pos++.

Likewise, we do the same for array2 and store each element in result starting from the position after array1.
 */
