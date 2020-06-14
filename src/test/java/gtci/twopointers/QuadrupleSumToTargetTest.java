package gtci.twopointers;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import static gtci.twopointers.QuadrupleSumToTarget.*;

public class QuadrupleSumToTargetTest {
    @Test
    public void example1() {
        int[] arr = new int[] {4, 1, 2, -1, 1, -3};
        int target = 1;
        List<List<Integer>> actual = searchQuadruplets(arr, target);
        List<List<Integer>> expected = new ArrayList<>();

        expected.add(Arrays.asList(-3, -1, 1, 4));
        expected.add(Arrays.asList(-3, 1, 1, 2));

        assertEquals(expected, actual);
    }

    @Test
    public void example2() {
        int[] arr = new int[] {2, 0, -1, 1, -2, 2};
        int target = 2;
        List<List<Integer>> actual = searchQuadruplets(arr, target);
        List<List<Integer>> expected = new ArrayList<>();

        expected.add(Arrays.asList(-2, 0, 2, 2));
        expected.add(Arrays.asList(-1, 0, 1, 2));

        assertEquals(expected, actual);
    }
}
