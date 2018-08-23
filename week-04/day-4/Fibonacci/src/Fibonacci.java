public class Fibonacci {
    private int a;
    private int b;
    private int index;

    public Fibonacci(int index) {
        this.a = 0;
        this.b = 1;
        this.index = index;
    }

    public int fibIndex() {
        for (int i = 1; i <= index; i++) {
            a = a + b;
            b = a - b;
        }
        return b;
    }
}