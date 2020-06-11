package gtci.twopointers;

import java.util.*;

/**
 * Given an array with positive numbers and a target number, find all of its contiguous subarrays
 * whose product is less than the target number.
 */
public class SubarrayProductLessThanKViaBrute {
    public static List<List<Integer>> findSubarrays(int[] arr, int target) {
        List<List<Integer>> subarrays = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> nums = new ArrayList<>();
            int product = 1;

            for (int j = i; j < arr.length; j++) {
                product *= arr[j];
                nums.add(arr[j]);

                if (product < target) subarrays.add(new ArrayList<>(nums));
                else break;
            }
        }

        return subarrays;
    }
}
