package gtci.twopointers;

import java.util.*;

/**
 * Given an array with positive numbers and a target number, find all of its contiguous subarrays
 * whose product is less than the target number.
 */
public class SubarrayProductLessThanK {
    private static int product(List<Integer> nums) {
        int prd = 1;

        for (int num : nums) prd *= num;

        return prd;
    }

    public static List<List<Integer>> findSubarrays(int[] arr, int target) {
        List<List<Integer>> subarrays = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> nums = new ArrayList<>();

            for (int j = i; j < arr.length; j++) {
                nums.add(arr[j]);

                if (product(nums) < target) subarrays.add(new ArrayList<>(nums));
                else break;
            }
        }

        return subarrays;
    }
}
