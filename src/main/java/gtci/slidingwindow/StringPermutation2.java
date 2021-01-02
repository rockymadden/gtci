package gtci.slidingwindow;

import java.util.*;
import java.util.Map.Entry;

/**
 * Given a string and a pattern, find out if the string contains any permutation of the pattern.
 *
 * Permutation is defined as the re-arranging of the characters of the string. For example, “abc”
 * has the following six permutations:
 *
 *  abc
 *  acb
 *  bac
 *  bca
 *  cab
 *  cba
 *
 * If a string has ‘n’ distinct characters, it will have n! permutations.
 */
public class StringPermutation2 {
    private static boolean isPerm(Map<Character, Integer> a, Map<Character, Integer> b) {
        if (a.size() != b.size()) return false;

        for (final Entry<Character, Integer> ent : a.entrySet()) {
            if (b.getOrDefault(ent.getKey(), -1) != ent.getValue()) return false;
        }

        return true;
    }

    public static boolean findPermutation(String str, String pattern) {
        final Map<Character, Integer> pat = new HashMap<>();
        final Map<Character, Integer> acc = new HashMap<>();
        final int n = str.length(), m = pattern.length();

        for (int i = 0; i < m; i++) {
            pat.put(pattern.charAt(i), pat.getOrDefault(pattern.charAt(i), 0) + 1);
        }

        for (int end = 0, start = 0; end < n; end++) {
            final char endChar = str.charAt(end);
            acc.put(endChar, acc.getOrDefault(endChar, 0) + 1);

            while (end - start + 1 > m) {
                final char startChar = str.charAt(start++);
                acc.put(startChar, acc.get(startChar) - 1);
                if (acc.get(startChar) == 0) acc.remove(startChar);
            }

            if (end - start + 1 == m && isPerm(acc, pat)) return true;
        }

        return false;
    }
}
