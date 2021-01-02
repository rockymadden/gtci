package gtci.slidingwindow;

import java.util.*;

/**
 * Given a string with lowercase letters only, if you are allowed to replace no more than 'k'
 * letters with any letter, find the length of the longest substring having the same letters
 * after replacement.
 */
public class CharacterReplacement2 {
    private static boolean canReplace(Map<Character, Integer> map, int k) {
        if (map.size() > 2) return false;

        boolean fnd = false;

        for (final int val : map.values()) fnd = val <= k || fnd;

        return fnd;
    }

    public static int findLength(String str, int k) {
        final char[] chrs = str.toCharArray();
        final Map<Character, Integer> map = new HashMap<>();
        int ans = 0;

        for (int end = 0, start = 0; end < chrs.length; end++) {
            final char endChr = chrs[end];
            map.put(endChr, map.getOrDefault(endChr, 0) + 1);

            while (!canReplace(map, k)) {
                final char startChr = chrs[start++];
                map.put(startChr, map.get(startChr) - 1);
                if (map.get(startChr) == 0) map.remove(startChr);
            }

            ans = Math.max(ans, end - start + 1);
        }

        return ans;
    }
}
