import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        /*
        Manual:
        --------------------
        .drinkSomeRum()
        .howsItGoingMate()
        .die()
        .brawl()
        .getHealth()
        .drinks()
         */

        Pirates blackBeard = new Pirates(2, "Black Beard");
        Pirates jackSparrow = new Pirates(2, "Jack Sparrow");
        Ship ship = new Ship(new Pirates(2, "Cpt. Jack"));
        ship.name = "Gold";
        Ship enemy = new Ship(new Pirates(2, "Cpt. Jack"));
        enemy.name = "Silver";

        //blackBeard.howsItGoingMate();
        //blackBeard.die();
        //blackBeard.brawl(jackSparrow);
        //blackBeard.getHealth();
        //blackBeard.drinks();

        Ship.fillShip(ship);
        ship.shipInfo();

        Ship.fillShip(enemy);
        enemy.shipInfo();

        ship.battle(enemy);

    }
}
