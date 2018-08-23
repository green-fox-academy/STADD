import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

    private Sum sum;

    @Before
    public void createSum(){
        sum = new Sum();
    }

    @Test
    public void sum() {
        assertEquals(6, sum.getSum());
    }
}