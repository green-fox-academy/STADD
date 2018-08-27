import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndexTest {

    @Test
    public void test1(){
        int[] list = {1, 2, 3, 4};
        int indexOf = 1;

        IndexMain index = new IndexMain();
        assertEquals(indexOf,index.testOfIndexOf(indexOf,list));
    }
}
