package gtci.slidingwindow;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static gtci.slidingwindow.MaxSumSubArrayOfSizeK.findMaxSumSubArray;

public class MaxSumSubArrayOfSizeKTest {
    @Test
    public void example1() {
        int[] arr = new int[] {2, 1, 5, 1, 3, 2};
        int k = 3;
        int expected = 9;
        int actual = findMaxSumSubArray(k, arr);

        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] arr = new int[] {2, 3, 4, 1, 5};
        int k = 2;
        int expected = 7;
        int actual = findMaxSumSubArray(k, arr);

        assertEquals(expected, actual);
    }
}
