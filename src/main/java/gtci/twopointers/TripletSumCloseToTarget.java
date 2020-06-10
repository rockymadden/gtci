package gtci.twopointers;

/**
 * Given an array of unsorted numbers and a target number, find a triplet in the array whose sum is
 * as close to the target number as possible, return the sum of the triplet. If there are more than
 * one such triplet, return the sum of the triplet with the smallest sum.
 */
public class TripletSumCloseToTarget {
    public static int searchTriplet(int[] arr, int targetSum) {
        int n = arr.length, cdiff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;

            while (left < right) {
                int diff = targetSum - arr[i] - arr[left] - arr[right];

                if (diff == 0) return targetSum;

                if (Math.abs(diff) < Math.abs(cdiff) || Math.abs(diff) == Math.abs(cdiff) && diff > cdiff)
                    cdiff = diff;

                if (diff > 0) left++;
                else right--;
            }
        }

        return targetSum - cdiff;
    }
}
