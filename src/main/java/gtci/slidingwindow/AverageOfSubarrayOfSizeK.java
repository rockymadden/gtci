package gtci.slidingwindow;

/**
 * Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
 */
public class AverageOfSubarrayOfSizeK {
    public static double[] findAverages(int K, int[] arr) {
        double[] ans = new double[arr.length - K + 1];
        int sum = 0;

        for (int end = 0, start = 0; end < arr.length; end++) {
            sum += arr[end];

            if (end >= K - 1) {
                ans[start] = (double) sum / K;
                sum -= arr[start++];
            }
        }

        return ans;
    }
}
