public class Main {
    public static void main(String[] args) {
        Sharpie sharpie = new Sharpie("green", 3);

        sharpie.use();
        sharpie.use();
        sharpie.use();
        sharpie.use();
        System.out.println(sharpie.inkAmount);
    }
}
