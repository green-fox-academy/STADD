public class NumberAdder {
    public static void main(String[] args) {

        System.out.println(adder(4));
    }

    public static int adder(int n) {
        if (n == 1) {
            return 1;
        } else {
            return adder(n - 1) + n;
        }
    }
}
