import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainHWTest {

    private MainHW mainHW;

    @BeforeEach
    void setUp(){
        mainHW = new MainHW ();
    }

    @Test
    public void testEvenNumber() {
        assertTrue(mainHW.evenOddNumber(2));
        assertTrue(mainHW.evenOddNumber(4));
        assertTrue(mainHW.evenOddNumber(100));
    }

    @Test
    public void testOddNumber() {
        assertFalse(mainHW.evenOddNumber(1));
        assertFalse(mainHW.evenOddNumber(3));
        assertFalse(mainHW.evenOddNumber(99));
    }

    @Test
    public void testNumberInInterval() {
        assertTrue(mainHW.numberInInterval(50));
        assertTrue(mainHW.numberInInterval(99));
        assertFalse(mainHW.numberInInterval(10));
        assertFalse(mainHW.numberInInterval(200));
    }

    @Test
    public void testIntervalBorders() {
        assertFalse(mainHW.numberInInterval(25));
        assertFalse(mainHW.numberInInterval(100));
    }





}
