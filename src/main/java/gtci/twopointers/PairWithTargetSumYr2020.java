package gtci.twopointers;

/**
 * Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal
 * to the given target.
 *
 * Write a function to return the indices of the two numbers (i.e. the pair) such that they add up
 * to the given target.
 */
public class PairWithTargetSumYr2020 {
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

    /**
     * Since the given array is sorted, a brute-force solution could be to iterate through the
     * array, taking one number at a time and searching for the second number through Binary Search.
     * The time complexity of this algorithm will be O(N ∗ logN). Can we do better than this?
     *
     * We can follow the Two Pointers approach. We will start with one pointer pointing to the
     * beginning of the array and another pointing at the end. At every step, we will see if the
     * numbers pointed by the two pointers add up to the target sum. If they do, we have found our
     * pair; otherwise, we will do one of two things:
     *
     *   1. If the sum of the two numbers pointed by the two pointers is greater than the target
     *      sum, this means that we need a pair with a smaller sum. So, to try more pairs, we can
     *      decrement the end-pointer.
     *   2. If the sum of the two numbers pointed by the two pointers is smaller than the target
     *      sum, this means that we need a pair with a larger sum. So, to try more pairs, we can
     *      increment the start-pointer.
     */
    public static int[] searchRef(int[] arr, int targetSum) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == targetSum)
                return new int[] { left, right }; // found the pair

            if (targetSum > currentSum)
                left++; // we need a pair with a bigger sum
            else
                right--; // we need a pair with a smaller sum
        }
        return new int[] { -1, -1 };
    }
}
