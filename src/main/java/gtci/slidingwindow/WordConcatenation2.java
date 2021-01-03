package gtci.slidingwindow;

import java.util.*;

/**
 * Given a string and a list of words, find all the starting indices of substrings in the given
 * string that are a concatenation of all the given words exactly once without any overlapping of
 * words. It is given that all words are of the same length.
 */
public class WordConcatenation2 {
    public static List<Integer> findWordConcatenation(String str, String[] words) {
        final List<Integer> ans = new ArrayList<>();
        final Map<String, Integer> frq = new HashMap<>();
        final int n = str.length(), m = words.length, l = words[0].length();

        for (final String word : words) frq.put(word, frq.getOrDefault(word, 0) + 1);

        for (int start = 0; start <= n - (m * l); start++) {
            final Map<String, Integer> acc = new HashMap<>();

            for (int end = start + l - 1; end <= start + (m * l); end += l) {
                final String sub = str.substring(end - l + 1, end + 1);
                if (!frq.containsKey(sub)) break;
                acc.put(sub, acc.getOrDefault(sub, 0) + 1);
                if (acc.get(sub) > frq.get(sub)) break;
            }

            if (frq.equals(acc)) ans.add(start);
        }

        return ans;
    }
}
