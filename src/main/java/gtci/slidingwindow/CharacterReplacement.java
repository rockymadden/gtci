package gtci.slidingwindow;

import java.util.*;

/**
 * Given a string with lowercase letters only, if you are allowed to replace no more than 'k'
 * letters with any letter, find the length of the longest substring having the same letters after
 * replacement.
 */
public class CharacterReplacement {
    private static boolean containsLessThanK(Map<Character, Integer> freq, int k) {
        boolean fnd = false;

        for (final int val : freq.values()) fnd = val <= k || fnd;

        return fnd;
    }

    public static int findLength(String str, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int longest = 0;

        for (int end = 0, start = 0, cnt = 0; end < str.length(); end++) {
            final char endChar = str.charAt(end);
            freq.put(endChar, freq.getOrDefault(endChar, 0) + 1);
            cnt++;

            while (freq.size() > 2 || (freq.size() == 2 && !containsLessThanK(freq, k))) {
                final char startChar = str.charAt(start);
                freq.put(startChar, freq.get(startChar) - 1);
                if (freq.get(startChar) == 0) freq.remove(startChar);
                cnt--;
                start++;
            }

            longest = Math.max(longest, cnt);
        }

        return longest;
    }
}
