package gtci.twopointers;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.twopointers.SubarrayProductLessThanK2.*;

public class SubarrayProductLessThanK2Test {
    @Test
    public void example1() {
        int[] arr = new int[] {2, 5, 3, 10};
        int target = 30;
        List<List<Integer>> actual = findSubarrays(arr, target);
        List<List<Integer>> expected = new ArrayList<>();

        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(2, 5));
        expected.add(Arrays.asList(5));
        expected.add(Arrays.asList(5, 3));
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(10));

        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] arr = new int[] {8, 2, 6, 5};
        int target = 50;
        List<List<Integer>> actual = findSubarrays(arr, target);
        List<List<Integer>> expected = new ArrayList<>();

        expected.add(Arrays.asList(8));
        expected.add(Arrays.asList(8, 2));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(2, 6));
        expected.add(Arrays.asList(6));
        expected.add(Arrays.asList(6, 5));
        expected.add(Arrays.asList(5));

        assertEquals(expected, actual);
    }
}
