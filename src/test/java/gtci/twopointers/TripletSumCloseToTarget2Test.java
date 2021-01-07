package gtci.twopointers;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.twopointers.TripletSumCloseToTarget2.*;

public class TripletSumCloseToTarget2Test {
    @Test
    public void example1() {
        int[] arr = new int[] {-2, 0, 1, 2};
        int target = 2;
        int actual = searchTriplet(arr, target);

        assertEquals(1, actual);
    }

    @Test
    public void example2() {
        int[] arr = new int[] {-3, -1, 1, 2};
        int target = 1;
        int actual = searchTriplet(arr, target);

        assertEquals(0, actual);
    }

    @Test
    public void example3() {
        int[] arr = new int[] {1, 0, 1, 1};
        int target = 100;
        int actual = searchTriplet(arr, target);

        assertEquals(3, actual);
    }
}
