package gtci.twopointers;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.twopointers.TripletSumToZero2.*;

public class TripletSumToZero2Test {
    @Test
    public void example1() {
        int[] arr = new int[] {-3, 0, 1, 2, -1, 1, -2}; // {-3, -2, -1, 0, 1, 1, 2}
        List<List<Integer>> actual = searchTriplets(arr);
        List<List<Integer>> expected = new ArrayList<>();

        expected.add(Arrays.asList(-3, 1, 2));
        expected.add(Arrays.asList(-2, 0, 2));
        expected.add(Arrays.asList(-2, 1, 1));
        expected.add(Arrays.asList(-1, 0, 1));

        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] arr = new int[] {-5, 2, -1, -2, 3}; // {-5, -2, -1, 2, 3}
        List<List<Integer>> actual = searchTriplets(arr);
        List<List<Integer>> expected = new ArrayList<>();

        expected.add(Arrays.asList(-5, 2, 3));
        expected.add(Arrays.asList(-2, -1, 3));

        assertEquals(expected, actual);
    }

    @Test
    public void custom1() {
        int[] arr = new int[] {-5, 2, 2, 3, 3}; // {-5, -2, -1, 2, 3}
        List<List<Integer>> actual = searchTriplets(arr);
        List<List<Integer>> expected = new ArrayList<>();

        expected.add(Arrays.asList(-5, 2, 3));

        assertEquals(expected, actual);
    }
}
