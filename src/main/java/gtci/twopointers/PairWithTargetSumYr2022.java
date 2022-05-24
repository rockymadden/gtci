package gtci.twopointers;

/**
 * Given an array of sorted numbers and a target sum, find a pair in the array whose sum is
 * equal to the given target.
 *
 * Write a function to return the indices of the two numbers (i.e. the pair) such that they add up
 * to the given target.
 */
public class PairWithTargetSumYr2022 {
    public static int[] search(int[] arr, int targetSum) {
        for (int left = 0, right = arr.length - 1; left < right;) {
            final int sum = arr[left] + arr[right];

            if (sum > targetSum) right--;
            else if (sum < targetSum) left--;
            else return new int[] { left, right };
        }

        return new int[] { -1, -1 };
    }
}
