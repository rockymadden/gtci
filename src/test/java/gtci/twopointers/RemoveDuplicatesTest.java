package gtci.twopointers;

import static org.junit.Assert.*;
import org.junit.Test;

public class RemoveDuplicatesTest {
    @Test
    public void example1() {
        final int[] arr = new int[] {2, 3, 3, 3, 6, 9, 9}; // [2, 3, 6, 9]

        assertEquals(4, RemoveDuplicatesYr2020.remove(arr.clone()));
        assertEquals(4, RemoveDuplicatesYr2020Att2.remove(arr.clone()));
        assertEquals(4, RemoveDuplicatesYr2022.remove(arr.clone()));
    }

    @Test
    public void example2() {
        final int[] arr = new int[] {2, 2, 2, 11}; // [2, 11]

        assertEquals(2, RemoveDuplicatesYr2020.remove(arr.clone()));
        assertEquals(2, RemoveDuplicatesYr2020Att2.remove(arr.clone()));
        assertEquals(2, RemoveDuplicatesYr2022.remove(arr.clone()));
    }
}
