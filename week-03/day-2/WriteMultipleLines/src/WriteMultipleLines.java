import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"

        String path = "my-file.txt";
        String word = "apple";
        int number = 6;
        writeFile(path, word, number);
    }

    public static void writeFile(String path, String word, int number) {
        List<String> content = new ArrayList();
        for (int i = 0; i < number; i++) {
            content.add(word);
        }
        try {
            Path filePath = Paths.get(path);
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }
}