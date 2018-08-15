public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal();

        cat.drink();
        cat.eat();
        cat.eat();
        cat.play();
        System.out.println(cat.thirst);
        System.out.println(cat.hunger);

    }
}
