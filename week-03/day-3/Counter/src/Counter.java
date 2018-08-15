public class Counter {
    int counter = 0;

    public void add(int number) {
        this.counter += number;
    }

    public void add() {
        this.counter++;
    }

    public void reset() {
        this.counter = 0;
    }

    public void get() {
        System.out.println(this.counter);
    }
}
