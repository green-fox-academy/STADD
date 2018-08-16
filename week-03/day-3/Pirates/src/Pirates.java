public class Pirates {
    boolean intoxicated;
    boolean alive = true;
    boolean parrot;
    int health;
    String name;

    int drinkCounter;


    Pirates(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public void getHealth() {
        System.out.println(this.health);
    }

    public void drinks() {
        System.out.println(this.drinkCounter);
    }


    public void drinkSomeRum() {
        if (alive) {
            intoxicated = true;
            drinkCounter++;
        } else {
            System.out.println("he's dead");
        }
        if (drinkCounter == 100) {
            parrot = true;
            System.out.println(this.name + " got a parrot!");
        }

    }

    public void howsItGoingMate() {
        if (alive == true) {
            if (drinkCounter <= 4) {
                System.out.println(this.name + ": Pour me anudder!");
            } else {
                System.out.println(this.name + "Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            }
        } else {
            System.out.println(this.name + " is dead...");
        }

    }

    public void die() {
        alive = false;
    }

    public void brawl(Pirates pirates) {
        this.health -= Math.random() * 2 + 0;
        pirates.health -= Math.random() * 2 + 0;
        if (this.health == 0) {
            this.die();
            System.out.println(this.name + " died");
        } else if (pirates.health == 0) {
            pirates.die();
            System.out.println(pirates.name + " died");
        }
        if (pirates.health == this.health && this.health == 1 && pirates.health == 1) {
            System.out.println("They both passed out");
        }
    }
}
