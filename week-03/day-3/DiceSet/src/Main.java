import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();

        for (int i = 0; i < 6; i++) {
            do {
                diceSet.reroll(i);
            } while (diceSet.getCurrent(i) != 6);
        }
        System.out.println(Arrays.toString(diceSet.getCurrent()));
    }
}
