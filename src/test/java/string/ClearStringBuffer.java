package string;

// Java program to clear using StringBuffer using delete()

public class ClearStringBuffer {
    public static void main(String[] args) {

        // create a string buffer
        StringBuffer str = new StringBuffer();

        // add string to string buffer
        str.append("Java");
        str.append(" is");
        str.append(" popular.");
        System.out.println("StringBuffer: " + str);

        // clear the string
        // using delete()
        str.delete(0, str.length());
        System.out.println("Updated StringBuffer: " + str);
    }
}
