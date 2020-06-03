package gtci.twopointers;

/**
 * Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal
 * to the given target.
 *
 * Write a function to return the indices of the two numbers (i.e. the pair) such that they add up
 * to the given target.
 */
public class PairWithTargetSum {
    public static int[] search(int[] arr, int targetSum) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == targetSum) return new int[] {left, right};
            else if (sum < targetSum) left++;
            else right--;
        }

        return new int[] {-1, -1};
    }
}
