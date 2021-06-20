package collections;

// Convert Array to Set using stream

import java.util.*;
import java.util.stream.Collectors;

public class ConvertArrayToSet02 {
    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};
        Set<String> set = new HashSet<>(Arrays.stream(array).collect(Collectors.toSet()));

        System.out.println("Set: " + set);

    }
}
