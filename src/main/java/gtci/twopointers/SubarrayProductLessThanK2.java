package gtci.twopointers;

import java.util.*;

/**
 * Given an array with positive numbers and a target number, find all of its contiguous subarrays
 * whose product is less than the target number.
 */
public class SubarrayProductLessThanK2 {
    private static int product(final List<Integer> nums) {
        int prd = 1;

        for (final int num : nums) prd *= num;

        return prd;
    }

    public static List<List<Integer>> findSubarrays(int[] arr, int target) {
        final List<List<Integer>> subarrays = new ArrayList<>();

        for (int start = 0; start < arr.length; start++) {
            final List<Integer> wnd = new ArrayList<>();
            int end = start;
            int prd = Integer.MIN_VALUE;

            while (end < arr.length && prd < target) {
                wnd.add(arr[end++]);
                prd = product(wnd);
                if (prd < target) subarrays.add(List.copyOf(wnd));
            }
        }

        return subarrays;
    }
}
