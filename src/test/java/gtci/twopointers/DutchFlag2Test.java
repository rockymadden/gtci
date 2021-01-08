package gtci.twopointers;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.twopointers.DutchFlag2.*;

public class DutchFlag2Test {
    @Test
    public void example1() {
        int[] arr = new int[] {1, 0, 2, 1, 0};
        sort(arr);

        assertArrayEquals(new int[] {0, 0, 1, 1, 2}, arr);
    }

    @Test
    public void example2() {
        int[] arr = new int[] {2, 2, 0, 1, 2, 0};
        sort(arr);

        assertArrayEquals(new int[] {0, 0, 1, 2, 2, 2}, arr);
    }
}
