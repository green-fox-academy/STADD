public class BattleApp {
    public static void main(String[] args) {

        /*
        Manual: Pirate | Ship
        --------------------
        Pirate:
        .drinkSomeRum()
        .howsItGoingMate()
        .die()
        .brawl()
        .getHealth()
        .drinks()

        Ship:
        .fillShip()
        .shipInfo()
        .battle()
         */

        Ship ship = new Ship(new Pirates(2, "Black"));
        ship.name = "Gold";
        Ship enemy = new Ship(new Pirates(2, "Jack"));
        enemy.name = "Silver";
        Armada armada = new Armada();
        armada.size();

        Ship.fillShip(ship);
        ship.shipInfo();

        Ship.fillShip(enemy);
        enemy.shipInfo();

        ship.battle(enemy);
    }
}
