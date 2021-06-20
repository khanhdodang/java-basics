package functions;

// Define lambda expressions as method parameters

import java.util.ArrayList;

public class LambdaExpression {
    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // add elements to the ArrayList
        languages.add("java");
        languages.add("swift");
        languages.add("python");
        System.out.println("ArrayList: " + languages);

        // pass lambda expression as parameter to replaceAll() method
        languages.replaceAll(e -> e.toUpperCase());
        System.out.println("Updated ArrayList: " + languages);
    }
}

/*
Output

ArrayList: [java, swift, python]
Updated ArrayList: [JAVA, SWIFT, PYTHON]
In the above example, we have created an arraylist named languages. Notice the line,

languages.replaceAll(e -> e.toUpperCase());
Here, e -> e.toUpperCase() is a lambda expression. It takes all elements of the arraylist and converts them into uppercase.
 */