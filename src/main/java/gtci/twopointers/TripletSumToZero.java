package gtci.twopointers;

import java.util.*;

/**
 * Given an array of unsorted numbers, find all unique triplets in it that add up to zero.
 */
public class TripletSumToZero {
    public static List<List<Integer>> searchTriplets(int[] arr) {
        List<List<Integer>> triplets = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i -1]) continue;

            int target = -arr[i];
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[left] + arr[right];

                if (sum == target) {
                    triplets.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    while (left < right && arr[left] == arr[left - 1]) left++;
                    right--;
                    while (left < right && arr[right] == arr[right + 1]) right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return triplets;
    }
}
