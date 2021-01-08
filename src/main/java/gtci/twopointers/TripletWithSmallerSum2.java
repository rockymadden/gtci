package gtci.twopointers;

import java.util.*;

/**
 * Given an array arr of unsorted numbers and a target sum, count all triplets in it such that
 * arr[i] + arr[j] + arr[k] < target where i, j, and k are three different indices. Write a
 * function to return the count of such triplets.
 */
public class TripletWithSmallerSum2 {
    public static int searchTriplets(int[] arr, int target) {
        final int n = arr.length;
        int ans = 0;

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                final int sum = arr[i] + arr[left] + arr[right];

                if (sum < target) {
                    ans += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }

        return ans;
    }
}
