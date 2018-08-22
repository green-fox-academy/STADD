public class main {
    public static void main(String[] args) {

        Gnirts g = new Gnirts("example");
        System.out.println(g.charAt(1));
        System.out.println(g.length());
        System.out.println(g.subSequence(3, 5));
        // should print out: l

        // Shifter s = new Shifter("example", 2);
        // System.out.println(s.charAt(0));
        // // should print out: a
    }
}
