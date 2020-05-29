package gtci.slidingwindow;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static gtci.slidingwindow.MaxFruitCountOf2Types.*;

public class MaxFruitCountOf2TypesTest {
    @Test
    public void example1() {
        char[] arr = new char[] {'A', 'B', 'C', 'A', 'C'};
        int output = findLength(arr);

        assertEquals(output, 3);
    }

    @Test
    public void example2() {
        char[] arr = new char[] {'A', 'B', 'C', 'B', 'B', 'C'};
        int output = findLength(arr);

        assertEquals(output, 5);
    }
}
