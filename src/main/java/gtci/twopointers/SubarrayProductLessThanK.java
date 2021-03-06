package gtci.twopointers;

import java.util.*;

/**
 * Given an array with positive numbers and a target number, find all of its contiguous subarrays
 * whose product is less than the target number.
 */
public class SubarrayProductLessThanK {
    public static List<List<Integer>> findSubarrays(int[] arr, int target) {
        List<List<Integer>> subarrays = new ArrayList<>();

        for (int right = 0, left = 0, product = 1; right < arr.length; right++) {
            List<Integer> nums = new ArrayList<>();
            product *= arr[right];

            while (product >= target && left < arr.length) product /= arr[left++];

            for (int i = right; i >= left; i--) {
                nums.add(0, arr[i]);
                subarrays.add(new ArrayList<>(nums));
            }
        }

        return subarrays;
    }
}
