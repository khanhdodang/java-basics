package string;

// Loop through each character of a string using for-each loop

public class IterateCharactersString02 {
    public static void main(String[] args) {

        // create a string
        String name = "Programiz";

        System.out.println("Characters in string \"" + name + "\":");

        // loop through each element using for-each loop
        for (char c : name.toCharArray()) {

            // access each character
            System.out.print(c + ", ");
        }

    }
}
