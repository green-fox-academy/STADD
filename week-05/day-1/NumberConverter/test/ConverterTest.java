import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    @Test
    public void test1() {
        Converter converter = new Converter();
        double number = 745.00;
        String result = "seven hundred and fourty five dollars";

        assertEquals(converter.converting(number, result), result);
    }

    @Test
    public void test2() {
        Converter converter = new Converter();
        double number = 745.00;
        String result = "seven hundred and fourty five dollars";

        assertEquals(converter.reConverting(number,result), number, 0);
    }
}
