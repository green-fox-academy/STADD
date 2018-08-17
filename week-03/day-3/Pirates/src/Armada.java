import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Armada {
    static List<Ship> shipList = new ArrayList<>();
    static Random rand = new Random();
    static int armadaSize = rand.nextInt(100);

    public void war(Armada armada) {
        for (int i = 0; i < armadaSize i++) {

        }
    }

    public static void createArmada(Armada armada) {

        for (int i = 0; i < armadaSize; i++) {
            shipList.add(new Ship(new Pirates(2, "pirate")));
        }
    }

    public void size() {
        System.out.println(armadaSize);
    }
}
