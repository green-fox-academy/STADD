public class Cuboid {
    public static void main(String[] args){

        double a = 10;
        double b = 10;
        double c = 10;

        double volume = Math.pow(a, 3);
        double surface = Math.pow(b, 2);

        System.out.println("Surface Area: " + surface * 6);
        System.out.println("Volume: " + volume );
    }
}
