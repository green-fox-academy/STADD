import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
    public static void main(String[] args) {
        String path = "my-file.txt";
        String copyName = "copy-new-file.txt";
        copyFunction(path, copyName);
    }

    public static void copyFunction(String path, String copyName) {
        Path filePath = Paths.get(path);
        Path copyFilePath = Paths.get(copyName);
        try {
            Files.copy(filePath, copyFilePath);
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println("Fail");
        }

    }
}
