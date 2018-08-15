import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // open and read it. The file data represents a tic-tac-toe
        // game result. Return 'X'/'O'/'draw' based on which player
        // has winning situation.
        String s = "win";
        ticTacResult(s);

        System.out.println(ticTacResult("win-o.txt"));
        // should print O

        System.out.println(ticTacResult("win-x.txt"));
        // should print X

        System.out.println(ticTacResult("draw.txt"));
        // should print draw
    }

    public static Boolean ticTacResult(String s) {
        Path winO = Paths.get("win-o.txt");
        Path winX = Paths.get("win-x.txt");
        Path draw = Paths.get("draw.txt");

        try {
            List<String> wino = Files.readAllLines(winO);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return ticTacResult(s);
    }
}