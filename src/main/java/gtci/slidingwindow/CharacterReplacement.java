package gtci.slidingwindow;

import java.util.*;

/**
 * Given a string with lowercase letters only, if you are allowed to replace no more than 'k'
 * letters with any letter, find the length of the longest substring having the same letters after
 * replacement.
 */
public class CharacterReplacement {
    private static boolean containsLessThanK(Map<Character, Integer> freq, int k) {
        boolean can = false;

        for (int val : freq.values()) can = val <= k || can;

        return can;
    }

    public static int findLength(String str, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int longest = 0;

        for (int end = 0, start = 0, cnt = 0; end < str.length(); end++) {
            char endChar = str.charAt(end);
            freq.put(endChar, freq.getOrDefault(endChar, 0) + 1);
            cnt++;

            while (freq.size() > 2 || (freq.size() == 2 && !containsLessThanK(freq, k))) {
                char startChar = str.charAt(start);
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
