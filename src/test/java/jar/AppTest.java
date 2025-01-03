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
    public static void testAddition() {
        int result1 = AppCalc.add(5,8);
        assertEquals(13, result1, "5 + 8 should equal 13");
        int result2 = AppCalc.add(9,19);
        assertEquals(28, result2, "9 + 19 should equal 28");
        int result3 = AppCalc.add(-5,19);
        assertEquals(14, result3, "-5 + 19 should equal 14");
    }
}
