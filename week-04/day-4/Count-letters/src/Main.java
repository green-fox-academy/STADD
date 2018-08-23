public class Main {
    public static void main(String[] args) {

        CountLetters a = new CountLetters("teszt");

        a.addToMap();

        System.out.println(a.getMap());

        a.countOccurence();
        System.out.println(a.getMap());
    }
}
