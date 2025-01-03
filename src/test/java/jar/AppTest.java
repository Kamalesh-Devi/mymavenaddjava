package jar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAdd() {
        AppCalc calc = new AppCalc();
        int result = calc.add(5,8);
        assertEquals(13, result, "5 + 8 should equal 13");
    }
}
