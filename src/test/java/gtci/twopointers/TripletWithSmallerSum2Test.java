package gtci.twopointers;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.twopointers.TripletWithSmallerSum2.*;

public class TripletWithSmallerSum2Test {
    @Test
    public void example1() {
        int[] arr = new int[] {-1, 0, 2, 3};
        int target = 3;
        int actual = searchTriplets(arr, target);

        assertEquals(2, actual);
    }

    @Test
    public void example2() {
        int[] arr = new int[] {-1, 4, 2, 1, 3};
        int target = 5;
        int actual = searchTriplets(arr, target);

        assertEquals(4, actual);
    }
}
