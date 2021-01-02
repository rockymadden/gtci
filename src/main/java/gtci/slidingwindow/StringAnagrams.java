package gtci.slidingwindow;

import java.util.*;

/**
 * Given a string and a pattern, find all anagrams of the pattern in the given string.
 *
 * Anagram is actually a Permutation of a string. For example, “abc” has the following six
 * anagrams:
 *
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 *
 * Write a function to return a list of starting indices of the anagrams of the pattern in the
 * given string.
 */
public class StringAnagrams {
    private static boolean isAnagram(int[] cmp, int[] frq) {
        for (int i = 0; i < 26; i++) {
            if (cmp[i] > 0 && frq[i] != cmp[i]) return false;
        }

        return true;
    }

    public static List<Integer> findStringAnagrams(String str, String pattern) {
        final List<Integer> ans = new ArrayList<Integer>();
        final int[] cmp = new int[26], frq = new int[26];
        final int n = str.length(), m = pattern.length();

        for (final char ch : pattern.toCharArray()) cmp[ch - 'a']++;

        for (int end = 0, start = 0; end < n; end++) {
            final char endChar = str.charAt(end);
            frq[endChar - 'a']++;

            if (end - start + 1 > m) {
                final char startChar = str.charAt(start);
                frq[startChar - 'a']--;
                start++;
            }

            if (isAnagram(cmp, frq)) ans.add(start);
        }

        return ans;
    }
}
