import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {

        String fileName = "teszt.txt";
        System.out.println(lineCounter(fileName));
    }

    public static String lineCounter(String fileName) {
        Path filePath = Paths.get(fileName);
        try {
            List<String> myFile = Files.readAllLines(filePath);
            System.out.println(myFile.size());
        } catch (IOException e) {
            System.out.println("0");
        }
        return fileName;
    }
}
