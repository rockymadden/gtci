package gtci.slidingwindow;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.twopointers.SortedArraySquares.*;

public class SortedArraySquaresTest {
    @Test
    public void example1() {
        int[] arr = new int[] {-2, -1, 0, 2, 3};
        int[] actual = makeSquares(arr);

        assertArrayEquals(new int[] {0, 1, 4, 4, 9}, actual);
    }

    @Test
    public void example2() {
        int[] arr = new int[] {-3, -1, 0, 1, 2};
        int[] actual = makeSquares(arr);

        assertArrayEquals(new int[] {0, 1, 1, 4, 9}, actual);
    }

    @Test
    public void custom1() {
        int[] arr = new int[] {-3, -2, -1};
        int[] actual = makeSquares(arr);

        assertArrayEquals(new int[] {1, 4, 9}, actual);
    }

    @Test
    public void custom2() {
        int[] arr = new int[] {1, 2, 3};
        int[] actual = makeSquares(arr);

        assertArrayEquals(new int[] {1, 4, 9}, actual);
    }
}
