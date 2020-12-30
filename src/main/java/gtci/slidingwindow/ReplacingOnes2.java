package gtci.slidingwindow;

/**
 * Given an array containing 0s and 1s, if you are allowed to replace no more than 'k' 0s with 1s, find the length of
 * the longest contiguous subarray having all 1s.
 */
public class ReplacingOnes2 {
    public static int findLength(int[] arr, int k) {
        final int[] zno = new int[2];
        int ans = 0;

        for (int end = 0, start = 0; end < arr.length; end++) {
            zno[arr[end]]++;
            while (zno[0] > k) zno[arr[start++]]--;
            ans = Math.max(ans, zno[0] + zno[1]);
        }

        return ans;
    }
}
