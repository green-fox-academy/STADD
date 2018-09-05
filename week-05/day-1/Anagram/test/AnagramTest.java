import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class AnagramTest {
    Anagram anagram;

    @Before
    public void createAnagram(){
        anagram = new Anagram();
    }

    @Test
    public void test1() {
        String string1 = "rail safety";
        String string2 = "fairy tales";

        assertTrue(anagram.anagramOne(string1, string2));
    }

    @Test
    public void test2() {
        String string1 = "rail safety";
        String string2 = "fairy tales";

        assertFalse(anagram.anagramOne(string1, string2));
    }

}
