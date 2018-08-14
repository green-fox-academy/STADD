import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        Path filePath = Paths.get("log.txt");
        ipAdress(filePath);
        getPostRatio(filePath);
    }

    public static void ipAdress(Path filePath) {
        try {
            ArrayList<String> ipS = new ArrayList<String>();
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                ipS.add(lines.get(i).substring(25, 38));
                System.out.println(ipS.get(i));
            }
        } catch (IOException e) {
            System.out.println("Missing log.txt file");
        }
    }

    public static void getPostRatio(Path filePath) {
        try {
            int get = 0;
            int post = 0;
            ArrayList<String> ratio = new ArrayList<String>();
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                ratio.add(lines.get(i).substring(41, 45));
                if (ratio.get(i).contains("GET ")) {
                    get += 1;
                }
                if (ratio.get(i).contains("POST")) {
                    post += 1;
                }
            }
            System.out.println(get + " / " + post);
        } catch (IOException e) {
            System.out.println("Missing log .txt file");
        }
    }
}
