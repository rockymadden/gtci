package gtci.slidingwindow;

/**
 * Given an array containing 0s and 1s, if you are allowed to replace no more than 'k' 0s with 1s,
 * find the length of the longest contiguous subarray having all 1s.
 */
public class ReplacingOnes {
    public static int findLength(int[] arr, int k) {
        int[] freq = new int[2];
        int longest = 0;

        for (int end = 0, start = 0; end < arr.length; end++) {
            freq[arr[end]]++;

            while (freq[0] > k) {
                freq[arr[start]]--;
                start++;
            }

            longest = Math.max(longest, freq[0] + freq[1]);
        }

        return longest;
    }
}
