import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    Fibonacci fib;

    @Before
    public void createFibonacci() {
        fib = new Fibonacci(10);
    }

    @Test
    public void fibIndex() {
        assertEquals(fib.fibIndex(), 34);
    }
}