package gtci.slidingwindow;

import java.util.*;
import java.util.Map.Entry;

/**
 * Given a string and a pattern, find the smallest substring in the given string which has all the
 * characters of the given pattern.
 */
public class MinimumWindowSubstring2 {
    private static boolean hasPat(Map<Character, Integer> acc, Map<Character, Integer> pat) {
        if (pat.size() > acc.size()) return false;

        for (Entry<Character, Integer> ent : pat.entrySet()) {
            if (acc.getOrDefault(ent.getKey(), -1) < ent.getValue()) return false;
        }

        return true;
    }

    public static String findSubstring(String str, String pattern) {
        final Map<Character, Integer> acc = new HashMap<>();
        final Map<Character, Integer> pat = new HashMap<>();
        int n = str.length(), m = pattern.length();
        String ans = null;

        for (int i = 0; i < m; i++) {
            pat.put(pattern.charAt(i), pat.getOrDefault(pattern.charAt(i), 0) + 1);
        }

        for (int end = 0, start = 0; end < n; end++) {
            final char endChar = str.charAt(end);
            acc.put(endChar, acc.getOrDefault(endChar, 0) + 1);

            while (hasPat(acc, pat)) {
                ans = ans == null || end - start + 1 < ans.length()
                    ? str.substring(start, end + 1)
                    : ans;
                final char startChar = str.charAt(start++);
                acc.put(startChar, acc.get(startChar) - 1);
                if (acc.get(startChar) == 0) acc.remove(startChar);
            }
        }

        return ans == null ? "" : ans;
    }
}
