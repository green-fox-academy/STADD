import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each of the lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"
    }

    public void mostProductiveYear(String studioName){
        try {
            Map<String, Integer> countYear = new HashMap<>();
            List<String> list = Files.readAllLines(Paths.get(studioName + ".csv"));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}