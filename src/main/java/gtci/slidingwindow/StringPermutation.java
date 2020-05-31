package gtci.slidingwindow;

import java.util.*;

/**
 * Given a string and a pattern, find out if the string contains any permutation of the pattern.
 *
 * Permutation is defined as the re-arranging of the characters of the string. For example, "abc"
 * has the following six permutations:
 *
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 *
 * If a string has 'n' distinct characters it will have n! permutations.
 */

public class StringPermutation {
    private static boolean find(int[] cmp, int[] frq) {
        for (int i = 0; i < 26; i++) {
            if (cmp[i] > 0 && frq[i] != cmp[i]) return false;
        }

        return true;
    }

    public static boolean findPermutation(String str, String pattern) {
        int[] cmp = new int[26], frq = new int[26];
        int n = str.length(), m = pattern.length();

        for (char ch : pattern.toCharArray()) cmp[ch - 'a']++;

        for (int end = 0, start = 0; end < n; end++) {
            char endChar = str.charAt(end);
            frq[endChar - 'a']++;

            if (end - start + 1 > m) {
                char startChar = str.charAt(start);
                frq[startChar - 'a']--;
                start++;
            }

            if (end - start + 1 == m && find(cmp, frq)) return true;
        }

        return false;
    }
}
