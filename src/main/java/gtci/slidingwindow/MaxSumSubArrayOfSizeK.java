package gtci.slidingwindow;

/**
 * Given an array of positive numbers and a positive number 'k', find the maximum sum of any
 * contiguous subarray of size 'k'.
 */
class MaxSumSubArrayOfSizeK {
    public static int findMaxSumSubArray(int k, int[] arr) {
        int max = 0;

        for (int end = 0, start = 0, sum = 0; end < arr.length; end++) {
            sum += arr[end];

            if (end - start + 1 == k) {
                max = Math.max(max, sum);
                sum -= arr[start];
                start++;
            }
        }

        return max;
    }
}
