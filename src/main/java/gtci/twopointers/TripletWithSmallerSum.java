package gtci.twopointers;

import java.util.*;

/**
 * Given an array arr of unsorted numbers and a target sum, count all triplets in it such that
 * arr[i] + arr[j] + arr[k] < target where i, j, and k are three different indices. Write a
 * function to return the count of such triplets.
 */
public class TripletWithSmallerSum {
    public static int searchTriplets(int[] arr, int target) {
        int count = 0;
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                if (arr[i] + arr[left] + arr[right] < target) {
                    count += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
}
