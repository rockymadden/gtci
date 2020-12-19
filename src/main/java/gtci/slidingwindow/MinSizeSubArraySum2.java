package gtci.slidingwindow;

/**
 * Given an array of positive numbers and a positive number 'S', find the length of the smallest
 * contiguous subarray whose sum is greater than or equal to 'S'. Return 0, if no such subarray
 * exists.
 */
class MinSizeSubArraySum2 {
    public static int findMinSubArray(int S, int[] arr) {
        int ans = Integer.MAX_VALUE;

        for (int end = 0, start = 0, sum = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum >= S && start <= end) {
                ans = Math.min(ans, end - start + 1);
                sum -= arr[start++];
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
