package gtci.twopointers;

import static org.junit.Assert.*;
import org.junit.Test;

public class PairWithTargetSumTest {
    @Test
    public void example1() {
        final int[] arr = new int[] {1, 2, 3, 4, 6};
        final int targetSum = 6;
        final int[] expected = new int[] {1, 3};

        assertArrayEquals(expected, PairWithTargetSumYr2020.search(arr, targetSum));
        assertArrayEquals(expected, PairWithTargetSumYr2020Att2.search(arr, targetSum));
        assertArrayEquals(expected, PairWithTargetSumYr2022.search(arr, targetSum));
    }

    @Test
    public void example2() {
        final int[] arr = new int[] {2, 5, 9, 11};
        final int targetSum = 11;
        final int[] expected = new int[] {0, 2};

        assertArrayEquals(expected, PairWithTargetSumYr2020.search(arr, targetSum));
        assertArrayEquals(expected, PairWithTargetSumYr2020Att2.search(arr, targetSum));
        assertArrayEquals(expected, PairWithTargetSumYr2022.search(arr, targetSum));
    }
}
