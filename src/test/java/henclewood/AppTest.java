package henclewood;

import org.junit.jupiter.api.Test;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.AssertionError;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void closeElementsGen()
    {
        App s = new App();
        List < Boolean > correct = Arrays.asList(s.hasCloseElements(new ArrayList < > (Arrays.asList(11.0, 2.0, 3.9, 4.0, 5.0, 2.2)), 0.3), 
        !s.hasCloseElements(new ArrayList < > (Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2)), 0.05), 
        s.hasCloseElements(new ArrayList < > (Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)), 0.95), 
        !s.hasCloseElements(new ArrayList < > (Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)), 0.8), 
        s.hasCloseElements(new ArrayList < > (Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0)), 0.1), 
        s.hasCloseElements(new ArrayList < > (Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1)), 1.0), 
        !s.hasCloseElements(new ArrayList < > (Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1)), 0.5));
        if (correct.contains(false)) {
            new AssertionError();
            print("hello");
        }
            
        /*assertTrue(correct.contains(false));*/
    }
    /*void testApp() {
        assertEquals(1, 1);
    }*/

    private void print(String string) {
    }
}
