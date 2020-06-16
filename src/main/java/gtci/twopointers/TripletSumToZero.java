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

   /**
     * This problem follows the Two Pointers pattern and shares similarities with Pair with Target
     * Sum. A couple of differences are that the input array is not sorted and instead of a pair we
     * need to find triplets with a target sum of zero.
     *
     * To follow a similar approach, first, we will sort the array and then iterate through it
     * taking one number at a time. Let’s say during our iteration we are at number ‘X’, so we need
     * to find ‘Y’ and ‘Z’ such that X+Y+Z==0. At this stage, our problem translates into finding a
     * pair whose sum is equal to Y+Z==−X).
     *
     * Another difference from Pair with Target Sum is that we need to find all the unique triplets.
     * To handle this, we have to skip any duplicate number. Since we will be sorting the array, so
     * all the duplicate numbers will be next to each other and are easier to skip.
     */
    public static List<List<Integer>> searchTripletsRef(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) // skip same element to avoid duplicate triplets
                continue;
            searchPair(arr, -arr[i], i + 1, triplets);
        }

        return triplets;
    }

    private static void searchPair(int[] arr, int targetSum, int left, List<List<Integer>> triplets) {
        int right = arr.length - 1;
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == targetSum) { // found the triplet
                triplets.add(Arrays.asList(-targetSum, arr[left], arr[right]));
                left++;
                right--;
                while (left < right && arr[left] == arr[left - 1])
                    left++; // skip same element to avoid duplicate triplets
                while (left < right && arr[right] == arr[right + 1])
                    right--; // skip same element to avoid duplicate triplets
            } else if (targetSum > currentSum)
                left++; // we need a pair with a bigger sum
            else
                right--; // we need a pair with a smaller sum
        }
    }
}
