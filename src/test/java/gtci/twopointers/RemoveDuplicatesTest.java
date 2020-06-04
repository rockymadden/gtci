package gtci.twopointers;

import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.twopointers.RemoveDuplicates.*;

public class RemoveDuplicatesTest {
    @Test
    public void example1() {
        int[] arr = new int[] {2, 3, 3, 3, 6, 9, 9}; // [2, 3, 6, 9]
        int actual = remove(arr);

        assertEquals(4, actual);
    }

    @Test
    public void example2() {
        int[] arr = new int[] {2, 2, 2, 11}; // [2, 11]
        int actual = remove(arr);

        assertEquals(2, actual);
    }
}
