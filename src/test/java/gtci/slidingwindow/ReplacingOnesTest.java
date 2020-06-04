package gtci.slidingwindow;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.slidingwindow.ReplacingOnes.*;

public class ReplacingOnesTest {
    @Test
    public void example1() {
        int[] arr = new int[] {0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1};
        int k = 2;
        int output = findLength(arr, k);

        assertEquals(6, output);
    }

    @Test
    public void example2() {
        int[] arr = new int[] {0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1};
        int k = 3;
        int output = findLength(arr, k);

        assertEquals(9, output);
    }
}
