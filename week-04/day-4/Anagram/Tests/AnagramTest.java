import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    Anagram teszt;

    @Before
    public void createAnagram() {
        teszt = new Anagram("teszt", "szett");
    }

    @Test
    public void areAnagram() {
        assertTrue(teszt.areAnagram() == true);
    }
}