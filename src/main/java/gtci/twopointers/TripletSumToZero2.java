package gtci.twopointers;

import java.util.*;

/**
 * Given an array of unsorted numbers, find all unique triplets in it that add up to zero.
 */
public class TripletSumToZero2 {
    public static List<List<Integer>> searchTriplets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            final int target = -arr[i];
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                final int sum = arr[left] + arr[right];

                if (sum == target) {
                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    if (left < right && arr[left] == arr[left - 1]) left++;
                    right--;
                    if (left < right && arr[right] == arr[right + 1]) right--;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return ans;
    }
}
