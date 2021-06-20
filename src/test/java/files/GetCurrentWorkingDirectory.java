package files;

import java.nio.file.Paths;

public class GetCurrentWorkingDirectory {
    public static void main(String[] args) {

        // Get current working directory
        String path = System.getProperty("user.dir");
        System.out.println("Working Directory = " + path);

        // Get the current working directory using Path
        path = Paths.get("").toAbsolutePath().toString();
        System.out.println("Working Directory = " + path);

    }
}
