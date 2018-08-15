public class Main {
    public static void main(String[] args) {

        Sharpie sharpie1 = new Sharpie("blue", 2);
        Sharpie sharpie2 = new Sharpie("green", 3);
        Sharpie sharpie3 = new Sharpie("red", 5);
        Sharpie sharpie4 = new Sharpie("yellow", 1);
        Sharpie sharpie5 = new Sharpie("orange", 4);
        Sharpie sharpie6 = new Sharpie("purple", 5);

        sharpie1.use();
        System.out.println(sharpie1.inkAmount);
    }
}
