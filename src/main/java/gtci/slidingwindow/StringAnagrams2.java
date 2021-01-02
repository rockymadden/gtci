package gtci.slidingwindow;

import java.util.*;
import java.util.Map.Entry;

/**
 * Given a string and a pattern, find all anagrams of the pattern in the given string.
 *
 * Anagram is actually a Permutation of a string. For example, “abc” has the following six
 * anagrams:
 *
 *  abc
 *  acb
 *  bac
 *  bca
 *  cab
 *  cba
 *
 * Write a function to return a list of starting indices of the anagrams of the pattern in the
 * given string.
 */
public class StringAnagrams2 {
    private static boolean isAnagram(Map<Character, Integer> a, Map<Character, Integer> b) {
        if (a.size() != b.size()) return false;

        for (final Entry<Character, Integer> ent : a.entrySet()) {
            if (b.getOrDefault(ent.getKey(), -1) != ent.getValue()) return false;
        }

        return true;
    }

    public static List<Integer> findStringAnagrams(String str, String pattern) {
        final List<Integer> ans = new ArrayList<>();
        final Map<Character, Integer> acc = new HashMap<>();
        final Map<Character, Integer> pat = new HashMap<>();
        final int n = str.length(), m = pattern.length();
        int nn = 0, mm = 0;

        for (int i = 0; i < m; i++) {
            pat.put(pattern.charAt(i), pat.getOrDefault(pattern.charAt(i), 0) + 1);
            mm++;
        }

        for (int end = 0, start = 0; end < n; end++) {
            char endChar = str.charAt(end);
            acc.put(endChar, acc.getOrDefault(endChar, 0) + 1);
            nn++;

            if (nn > mm) {
                char startChar = str.charAt(start++);
                acc.put(startChar, acc.get(startChar) - 1);
                if (acc.get(startChar) == 0) acc.remove(startChar);
                nn--;
            }

            if (nn == mm && isAnagram(acc, pat)) {
                ans.add(start);
            }
        }

        return ans;
    }
}
