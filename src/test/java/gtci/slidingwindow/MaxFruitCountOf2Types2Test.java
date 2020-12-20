package gtci.slidingwindow;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.slidingwindow.MaxFruitCountOf2Types2.*;

public class MaxFruitCountOf2Types2Test {
    @Test
    public void example1() {
        char[] arr = new char[] {'A', 'B', 'C', 'A', 'C'};
        int actual = findLength(arr);

        assertEquals(3, actual);
    }

    @Test
    public void example2() {
        char[] arr = new char[] {'A', 'B', 'C', 'B', 'B', 'C'};
        int actual = findLength(arr);

        assertEquals(5, actual);
    }
}
