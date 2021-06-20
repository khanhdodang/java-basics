package files;

import java.io.File;

public class GetAllFiles02 {
    public static void main(String[] args) {

        try {

            File folder = new File("C:\\Users\\Khanh Do\\Desktop\\Java Article");

            // list all the files
            File[] files = folder.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file);
                }
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
