package gtci.twopointers;

import java.util.*;

/**
 * Given an array of unsorted numbers and a target number, find a triplet in the array whose sum is
 * as close to the target number as possible, return the sum of the triplet. If there are more than
 * one such triplet, return the sum of the triplet with the smallest sum.
 */
public class TripletSumCloseToTarget2 {
    public static int searchTriplet(int[] arr, int targetSum) {
        final int n = arr.length;
        int ans = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                final int sum = arr[i] + arr[left] + arr[right];

                if (sum == targetSum) return sum;

                if (sum < targetSum) {
                    ans = Math.min(ans, Math.abs(targetSum - sum));
                    left++;
                } else {
                    ans = Math.min(ans, Math.abs(targetSum - sum));
                    right--;
                }
            }
        }

        return targetSum - ans;
    }
}
