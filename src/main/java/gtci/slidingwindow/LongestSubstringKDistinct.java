package gtci.slidingwindow;

import java.util.*;

/**
 * Given a string, find the length of the longest substring in it with no more than K distinct
 * characters.
 */
class LongestSubstringKDistinct {
    public static int findLength(String str, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int longest = 0;

        for (int end = 0, start = 0, sum = 0; end < str.length(); end++) {
            char endChar = str.charAt(end);
            freq.put(endChar, freq.getOrDefault(endChar, 0) + 1);
            sum++;

            while (freq.size() > k) {
                char startChar = str.charAt(start);
                freq.put(startChar, freq.get(startChar) - 1);
                if (freq.get(startChar) == 0) freq.remove(startChar);
                sum--;
                start++;
            }

            longest = Math.max(longest, sum);
        }

        return longest;
    }
}
