package gtci.slidingwindow;

import java.util.*;

/**
 * Given a string, find the length of the longest substring in it with no more
 * than K distinct characters.
 */
public class LongestSubstringKDistinct2 {
    public static int findLength(String str, int k) {
        final Map<Character, Integer> freq = new HashMap<>();
        final int n = str.length();
        int longest = 0;

        for (int end = 0, start = 0, sum = 0; end < n; end++) {
            final char endChar = str.charAt(end);
            freq.put(endChar, freq.getOrDefault(endChar, 0) + 1);
            sum++;

            while (freq.size() > k) {
                final char startChar = str.charAt(start);
                freq.put(startChar, freq.get(startChar) - 1);
                if (freq.get(startChar) == 0) freq.remove(startChar);
                start++;
                sum--;
            }

            longest = Math.max(longest, sum);
        }

        return longest;
    }
}
