package gtci.twopointers;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.twopointers.PairWithTargetSum2.*;

public class PairWithTargetSum2Test {
    @Test
    public void example1() {
        int[] arr = new int[] {1, 2, 3, 4, 6};
        int targetSum = 6;
        int[] actual = search(arr, targetSum);

        assertArrayEquals(new int[] {1, 3}, actual);
    }

    @Test
    public void example2() {
        int[] arr = new int[] {2, 5, 9, 11};
        int targetSum = 11;
        int[] actual = search(arr, targetSum);

        assertArrayEquals(new int[] {0, 2}, actual);
    }
}
