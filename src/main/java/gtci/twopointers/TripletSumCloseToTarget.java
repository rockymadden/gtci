package gtci.twopointers;

/**
 * Given an array of unsorted numbers and a target number, find a triplet in the array whose sum is
 * as close to the target number as possible, return the sum of the triplet. If there are more than
 * one such triplet, return the sum of the triplet with the smallest sum.
 */
public class TripletSumCloseToTarget {
    public static int searchTriplet(int[] arr, int targetSum) {
        int n = arr.length;
        int closest = -targetSum;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (Math.abs(targetSum - sum) < Math.abs(targetSum - closest)) closest = sum;

                if (sum == targetSum) return targetSum;
                else if (sum < targetSum) left++;
                else right--;
            }
        }

        return closest;
    }
}
