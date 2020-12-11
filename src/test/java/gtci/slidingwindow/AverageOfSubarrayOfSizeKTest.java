package gtci.slidingwindow;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.slidingwindow.AverageOfSubarrayOfSizeK.*;

public class AverageOfSubarrayOfSizeKTest {
    @Test
    public void example1() {
        int[] arr = new int[] {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        double[] actual = findAverages(k, arr);
        double[] expected = new double[] {2.2, 2.8, 2.4, 3.6, 2.8};

        assertArrayEquals(expected, actual, 0.0);
    }
}
