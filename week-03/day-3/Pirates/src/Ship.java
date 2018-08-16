import java.util.*;

public class Ship {
    static Random rand = new Random();
    static List<Pirates> pirateList = new ArrayList<>();
    Pirates captain;
    int score;
    String name;

    static int crewSize;
    static int rumConsumed;

    Ship(Pirates captain) {
        this.captain = captain;
        this.score = score;
    }

    public static void fillShip(Ship ship) {

        for (int i = 0; i < crewSize; i++) {
            pirateList.add(new Pirates(2, "pirate"));
        }
    }

    public void battle(Ship ship) {
        System.out.println("-------");
        if (this.score > ship.score) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }

    public void shipInfo() {
        System.out.println("-------");
        System.out.println("Ship name: " + name);
        crewSize = rand.nextInt(100);
        rumConsumed = rand.nextInt(10);
        System.out.println("Crew size: " + crewSize);
        for (int i = 0; i < rumConsumed; i++) {
            captain.drinkSomeRum();
        }
        System.out.println("The captain consumed " + captain.drinkCounter + " bottles of rum");
        if (captain.alive == false) {
            System.out.println("The captain is dead");
        }
        score = crewSize - rumConsumed;
        System.out.println(score);
    }
}
