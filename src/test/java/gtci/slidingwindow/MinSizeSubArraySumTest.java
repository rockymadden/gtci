package gtci.slidingwindow;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.slidingwindow.MinSizeSubArraySum.*;

public class MinSizeSubArraySumTest {
    @Test
    public void example1() {
        int[] arr = new int[] {2, 1, 5, 2, 3, 2};
        int S = 7;
        int expected = 2;
        int actual = findMinSubArray(S, arr);

        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] arr = new int[] {2, 1, 5, 2, 8};
        int S = 7;
        int expected = 1;
        int actual = findMinSubArray(S, arr);

        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        int[] arr = new int[] {3, 4, 1, 1, 6};
        int S = 8;
        int expected = 3;
        int actual = findMinSubArray(S, arr);

        assertEquals(expected, actual);
    }
}
