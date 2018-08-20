public class Counter {
    public static void main(String[] args) {
        counter(10);
    }

    public static int counter(int n) {
        if (n == 0) {
            System.out.println(n);
            return 0;
        } else {
            System.out.println(n);
            return counter(n - 1);
        }
    }
}
