package gtci.twopointers;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.twopointers.ShortestWindowSort.*;

public class ShortestWindowSortTest {
    @Test
    public void example1() {
        int[] arr = new int[] {1, 2, 5, 3, 7, 10, 9 ,12};
        int actual = sort(arr);

        assertEquals(5, actual);
    }

    @Test
    public void example2() {
        int[] arr = new int[] {1, 3, 2, 0, -1, 7, 10};
        int actual = sort(arr);

        assertEquals(5, actual);
    }

    @Test
    public void example3() {
        int[] arr = new int[] {1, 2, 3};
        int actual = sort(arr);

        assertEquals(0, actual);
    }

    @Test
    public void example4() {
        int[] arr = new int[] {3, 2, 1};
        int actual = sort(arr);

        assertEquals(3, actual);
    }
}
