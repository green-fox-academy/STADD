import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

    CountLetters a;

    @Before
    public void createCounter(){
        a = new CountLetters("Hello");
    }

    @Test
    public void countOccurence() {
        a.countOccurence();
    }
}