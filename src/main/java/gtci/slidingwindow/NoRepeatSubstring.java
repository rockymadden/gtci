package gtci.slidingwindow;

import java.util.*;

/**
 * Given a string, find the length of the longest substring which has no repeating characters.
 */
public class NoRepeatSubstring {
    public static int findLength(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        int longest = 0;

        for (int end = 0, start = 0, cnt = 0; end < str.length(); end++) {
            char endChar = str.charAt(end);
            freq.put(endChar, freq.getOrDefault(endChar, 0) + 1);
            cnt++;

            while (cnt > freq.size()) {
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
