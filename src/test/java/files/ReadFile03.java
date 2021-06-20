package files;

import java.io.File;
import java.util.Scanner;

public class ReadFile03 {
    public static void main(String[] args) {

        try {
            // create a new file object
            File file = new File("input.txt");

            // create an object of Scanner
            // associated with the file
            Scanner sc = new Scanner(file);

            // read each line from file and print it
            System.out.println("Reading File Using Scanner:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            // close scanner
            sc.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
